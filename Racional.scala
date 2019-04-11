package num1
import java.math

case class Racional(Num:Double, Den:Double) extends Alcuadrado{
  require(Den != 0)

  def this(numerador:Double)={
    this(numerador, 1)
  }
  
  def toDecimal():Double = this.Num/this.Den
  
  def *(rad:Racional):Racional = {
    val numer:Double = this.Num * rad.Num
    val denom:Double = this.Den * rad.Den
    return new Racional(numer, denom)
  }
  
  def /(rad:Racional):Racional = {
    val numer:Double = this.Num / rad.Num
    val denom:Double = this.Den / rad.Den
    return new Racional(numer, denom)
  }
  
  def +(rad:Racional):Racional = {
    val numer:Double = this.Num + rad.Num
    val denom:Double = this.Den + rad.Den
    return new Racional(numer, denom)
  }
    
  def -(rad:Racional):Racional = {
    val numer:Double = this.Num - rad.Num
    val denom:Double = this.Den - rad.Den
    return new Racional(numer, denom)
  }

  def potencia(rad:Racional):Racional = {
    val numer:Double = Math.pow(this.Num, rad.Num)
    val denom:Double = Math.pow(this.Den, rad.Den)
    return new Racional(numer, denom)
  }
  
  def alcuadrado():Racional={
    return new Racional(this.Num*this.Num, this.Den*this.Den)
  }

}
