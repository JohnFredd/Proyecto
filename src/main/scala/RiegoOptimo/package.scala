import common.task

import scala.collection.parallel.CollectionConverters._
import scala.collection.parallel.immutable.ParVector
import scala.util.Random

package object RiegoOptimo {

  type Tablon = (Int, Int, Int)
  type Finca = Vector[Tablon]
  type Distancia = Vector[Vector[Int]]
  type ProgRiego = Vector[Int]
  type TiempoInicioRiego = Vector[Int]

  val random = new Random()

  def fincaAlAzar(long: Int): Finca = {
    val v = Vector.fill(long) {
      (random.nextInt(long*2)+1,
        random.nextInt(long)+1,
        random.nextInt(4)+1)}
    v
  }

  def distanciaAlAzar(long: Int): Distancia = {
    val v = Vector.fill(long, long) {
      random.nextInt(long*3)+1
    }
    Vector.tabulate(long, long)(
      (i, j) => if (i<j) v(i)(j)
      else if (i==j) 0
      else v(j)(i))
  }

  def tsup(f: Finca, i: Int): Int = {
    f(i)._1
  }

  def treg(f: Finca, i: Int): Int = {
    f(i)._2
  }

  def prio(f: Finca, i: Int): Int = {
    f(i)._3
  }


  def tIR(f: Finca, pi: ProgRiego): TiempoInicioRiego = {
    def tIRAux(j: Int, acc: Vector[Int]): Vector[Int] = {
      if (j >= f.length) acc
      else {
        val tIRj = if (j == 0) 0 else acc(pi(j - 1)) + tReg(f, pi(j - 1))
        tIRAux(j + 1, acc.updated(pi(j), tIRj))
      }
    }

    tIRAux(0, Vector.fill(f.length)(0))
  }

  def costoRiegoFinca(f : Finca, pi : ProgRiego) : Int = {
    pi.foldLeft(0)((acc, numeroDeTablon) => 
    acc + costoRiegoTablon(numeroDeTablon, f, pi))
  }

  def costoMovilidad(f: Finca, pi: ProgRiego, d: Distancia): Int = {
    def calcular(pi: ProgRiego): Vector[Int] = pi match {
      case x +: y +: xs => d(x)(y) +: calcular(y +: xs)
      case _ => Vector.empty
    }
    calcular(pi).foldLeft(0)((x,y) => x+y)
  }

  def generarProgramacionesRiego(f: Finca): Vector[ProgRiego] = {
    def aux(v: Vector[Int]): Vector[Vector[Int]] = {
      if (v.isEmpty) {
        Vector(Vector.empty)
      } else {
        for {
          a <- v
          p <- aux(v.tail)
        } yield a +: p
      }
    }

    val inicial = (0 until f.size).toVector
    aux(inicial)
  }

  def costoMovilidadPar(f: Finca, pi: ProgRiego, d: Distancia): Int = {
    def calcular(pi: ProgRiego): Vector[Int] = pi match {
      case x +: y +: xs => d(x)(y) +: calcular(y +: xs)
      case _ => Vector.empty
    }

    val t = (pi.size + 3) / 4
    val (p1, s1) = pi.splitAt(t)
    val (p2, s2) = s1.splitAt(t)
    val (p3, s3) = s2.splitAt(t)
    val p4 = s3

    val c1 = task(calcular(p1).foldLeft(0)((x, y) => x + y))
    val c2 = task(calcular(p1.last +: p2).foldLeft(0)((x, y) => x + y))
    val c3 = task(calcular(p2.last +: p3).foldLeft(0)((x, y) => x + y))
    val c4 = calcular(p3.last +: p4).foldLeft(0)((x, y) => x + y)

    c1.join() + c2.join() + c3.join() + c4
  }

  def generarProgramacionesRiegoPar(f: Finca): Vector[ProgRiego] = {
    def aux(v: Vector[Int]): Vector[Vector[Int]] = {
      if (v.isEmpty) {
        Vector(Vector.empty)
      } else {
        v.flatMap { a =>
          val subPermutaciones = aux(v.tail)
          subPermutaciones.map(a +: _)
        }
      }
    }

    def auxPar(v: Vector[Int]): Vector[Vector[Int]] = {
      if (v.isEmpty) {
        Vector(Vector.empty)
      } else {
        v.par.flatMap { a =>
          val subPermutaciones = aux(v.tail)
          subPermutaciones.map(a +: _)
        }.toVector
      }
    }

    val inicial = (0 until f.size).toVector
    auxPar(inicial)
  }

}
