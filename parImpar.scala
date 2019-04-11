package num1

import java.util.Scanner

object scala {
  def main(args:Array[String])={
  
    val scan:Scanner = new Scanner(System.in)
    print("Introduce un numero: ")
    val x:Int = scan.nextInt()
    val y:Int = x % 2
    
    y match{
      case 0 => println("par")
      case _ => println("impar")
      
    }
    
  }
}