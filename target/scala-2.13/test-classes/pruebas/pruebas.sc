import RiegoOptimo._
import org.scalameter.{Key, Warmer, config}

val standardConfig = config (
  Key.exec.minWarmupRuns := 20,
  Key.exec.maxWarmupRuns := 40,
  Key.exec.benchRuns := 25,
  Key.verbose := false
) withWarmer (Warmer.Default())

val finca = fincaAlAzar(10)
val distancia = distanciaAlAzar(5)
val programacion = Vector(0,1,4,2,3)

//costoMovilidad(finca, programacion, distancia)
//costoMovilidadPar(finca, programacion, distancia)
//generarProgramacionesRiego(finca)
//generarProgramacionesRiegoPar(finca)
standardConfig measure(generarProgramacionesRiego(finca))
standardConfig measure(generarProgramacionesRiegoPar(finca))