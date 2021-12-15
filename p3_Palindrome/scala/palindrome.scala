object veri_palindrome{
  
    def main(args: Array[String]): Unit ={
	  println("palabra:")
	  val cadena = scala.io.StdIn.readLine()
	  println(esPalindrome(cadena))
	
	}
	def esPalindrome(palabra:String):Boolean = {
	  val len = palabra.length;
      for(i <- 0 until len/2) {
        if(palabra(i) != palabra(len-i-1)) return false; 
      }
      return true;
    }
}