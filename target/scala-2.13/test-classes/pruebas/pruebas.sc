import RiegoOptimo._
import org.scalameter.{Key, Warmer, config}
/*
val standardConfig = config (
  Key.exec.minWarmupRuns := 20,
  Key.exec.maxWarmupRuns := 40,
  Key.exec.benchRuns := 25,
  Key.verbose := false
) withWarmer (Warmer.Default())

val finca = fincaAlAzar(5)
val distancia = distanciaAlAzar(5)
val programacion = Vector(0,1,4,2,3)
*/
val i = 2
val f = Vector((10, 3, 4), (5, 3, 3), (2, 2, 1), (8, 1, 1), (6, 4, 2))
val pi = Vector(0, 1, 4, 2, 3)

//val resultado = costoRiegoTablon(i, f, pi)
val resultado1 = costoRiegoTablon(i:Int, f:Finca, pi:ProgRiego)
println(resultado1)

//costoMovilidad(finca, programacion, distancia)
//costoMovilidadPar(finca, programacion, distancia)
//generarProgramacionesRiego(finca)
//generarProgramacionesRiegoPar(finca)
//standardConfig measure(generarProgramacionesRiego(finca))
//standardConfig measure(generarProgramacionesRiegoPar(finca))