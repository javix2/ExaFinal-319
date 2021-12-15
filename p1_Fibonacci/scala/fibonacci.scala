object ser_fibonacci{
  
    def main(args: Array[String]): Unit ={
	  println("ingrese num:")
	  val num = scala.io.StdIn.readInt()
	  println(fib(num))
	
	}
	def fib (cnt: Int, low: BigInt=0, high: BigInt=1, sofar: List[BigInt]=Nil): List[BigInt] = {
		if (cnt == 0) (low :: sofar).reverse else fib (cnt - 1, high, low + high, low :: sofar) }
	
}