object calcula_ordsup{
  
    def main(args: Array[String]): Unit ={
		println("ingrese dos numeros:")
		val a = scala.io.StdIn.readInt()
		val b = scala.io.StdIn.readInt()

		suma_os(suma, a, b )
		resta_os(resta, a, b )
		multi_os(multiplicacion, a, b )
		divi_os(division, a, b )
    }

	def suma_os(f: (Int,Int) => Int, a:Int, b:Int ): Unit = {
		println("suma es: " + f(a, b))
	}
	def resta_os(f: (Int,Int) => Int, a:Int, b:Int ): Unit = {
		println("resta es: " + f(a, b))
	}
	def multi_os(f: (Int,Int) => Int, a:Int, b:Int ): Unit = {
		println("multiplicacion es: " + f(a, b))
	}
	def divi_os(f: (Int,Int) => Int, a:Int, b:Int ): Unit = {
		println("division es: " + f(a, b))
	}
	def suma: (Int, Int) => Int = (x: Int, y: Int) => {x + y}
	def resta: (Int, Int) => Int = (x: Int, y: Int) => {x - y}
	def multiplicacion: (Int, Int) => Int = (x: Int, y: Int) => {x * y}
	def division: (Int, Int) => Int = (x: Int, y: Int) => {x / y}
    
}