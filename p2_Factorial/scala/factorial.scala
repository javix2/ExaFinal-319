object factorial{
  
    def main(args: Array[String]): Unit ={
		println("ingrese num:")
	    val n = scala.io.StdIn.readInt()
        println("Factorial "+n+" = "+factorial(n))
    }

	def factorial(n: Int): Int =
    {
        if (n == 0) 
            return 1
        else
            return n * factorial(n-1)
    }
 
}