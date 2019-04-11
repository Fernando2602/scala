package num1

object calculadora {
  def main(args:Array[String]) = {

//    val a:Int = 2; 
//    val b:Int = 3;
    
//    val sum = suma(a)_
//    val rest = resta(a)_
//    val mult = multiplicacion(a)_
//    val div = division(a)_

    println(aplica(suma))
    println(aplica(resta))
    println(aplica(multiplicacion))
    println(aplica(division))
    
  }
  
   def aplica(Fun:(Int =>(Int=>Int))):Int={
     val d = Fun(10)
     return d(20)
   }

  
   def suma(a:Int)(b:Int):Int = {
    return a + b
   }

   def resta(a:Int)(b:Int):Int = {
    return a - b
   }
   
   def multiplicacion(a:Int)(b:Int):Int = {
    return a * b
   }
   
   def division(a:Int)(b:Int):Int = {
    return a / b
   }

}