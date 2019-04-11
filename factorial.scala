package num1

import java.util.Scanner

object factorial {
  
  def main(args: Array[String]) = {
 
    println(factorial(5))    
  
  }
  
  def factorial(n: Int): Int = {
        if (n == 0)
          return 1
        else return n * factorial(n-1)
  }

  
  
  
}