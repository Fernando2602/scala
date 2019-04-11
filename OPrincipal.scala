package num1

object OPrincipal {
  def main(args:Array[String])={
    val r1:Racional = new Racional(1,3)
    println(r1)
    val r2:Racional = new Racional(4)
    println(r2)
    
    val r3:Racional = r1 * r2
    println("La multiplicacion es " + r3)
    println("Su valor decimal es " + r3.toDecimal())

    val r4:Racional = r1 / r2
    println("La division es " + r4)
    println("Su valor decimal es " + r4.toDecimal())


    val r5:Racional = r1 + r2
    println("La suma es " + r5)
    println("Su valor decimal es " + r5.toDecimal())

    val r6:Racional = r1 - r2
    println("La resta es " + r6)
    println("Su valor decimal es " + r6.toDecimal())
    
    val r7:Racional = r1.potencia(r2)
    println("La potencia es " + r7)
    println("Su valor decimal es " + r7.toDecimal())

    
  }
}