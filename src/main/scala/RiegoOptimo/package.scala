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
    (Vector tabulate(Long, Long))(
      (i:Int, j:Int) => if (i<j) v(i)(j)
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

}
