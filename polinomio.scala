package num1
import java.util.Scanner
import java.lang.Math

object polinomio {
  def main(args:Array[String]) = {
    val scan:Scanner = new Scanner(System.in)
    print("Escribe el valor de x: ")
    val x:Double = scan.nextDouble()
    val x2:Double = Math.pow(x, 2)
    
    val resultado:Double = 2 + 5*x + x2
    
    println(resultado)
    
  }
}