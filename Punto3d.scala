package num1

case class Punto3d(uno:Double, dos:Double, tres:Double){

  def +(rad:Punto3d):Punto3d= {
    val uno:Double = this.uno + rad.uno
    val dos:Double = this.dos + rad.dos
    val tres:Double = this.tres + rad.tres

    return new Punto3d(uno, dos, tres)
  }

  def -(rad:Punto3d):Punto3d= {
    val uno:Double = this.uno - rad.uno
    val dos:Double = this.dos - rad.dos
    val tres:Double = this.tres - rad.tres

    return new Punto3d(uno, dos, tres)
  }

  def *(rad:Punto3d):Punto3d= {
    val uno:Double = this.uno * rad.uno
    val dos:Double = this.dos * rad.dos
    val tres:Double = this.tres * rad.tres

    return new Punto3d(uno, dos, tres)
  }
  
  
}