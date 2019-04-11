package num1

object OPrincipal3d {

  def main(args:Array[String])={
    val r1:Punto3d = new Punto3d(1,3,5)
    println(r1)
  
    val r2:Punto3d = new Punto3d(2,4,6)
    println(r2)

    
    val r3:Punto3d = r1 + r2
    println("La suma es " + r3)

    val r4:Punto3d = r1 - r2
    println("La resta es " + r4)

    val r5:Punto3d = r1 * r2
    println("La multiplicacion escalar es " + r5)
    
  
  }

  
  
}