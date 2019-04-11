package num1

abstract class Persona(RFC:Int, Nombre:String, AP_Paterno:String, AP_Materno:String, Edad:Int){ 

  def mostrar()
  
}

trait Bandera {

  def atrasado(x: Any): Boolean

}

class Dueño(RFC:Int, Nombre:String, AP_Paterno:String, AP_Materno:String, Edad:Int, Direccion:String, Telefono:String) extends Persona(RFC, Nombre, AP_Paterno, AP_Materno, Edad){ 

  def mostrar(){
    println(RFC)
    println(Edad)
  }

}

class Arrendatario(RFC:Int, Nombre:String, AP_Paterno:String, AP_Materno:String, Edad:Int, Antiguedad:Int, Telefono:String) extends Persona(RFC, Nombre, AP_Paterno, AP_Materno, Edad) with Bandera{ 

  def mostrar(){
    println(RFC)
    println(Edad)
  }
  
  def atrasado(x: Any): Boolean = {
    true
  }

}


object abstractClass {
   def main(args:Array[String]){
     var dueño = new Dueño(1234, "Fernando", "Contreras", "Lara", 22, "Circuito Crepusculo", "4772248145")
     dueño.mostrar()
     
     var arrendatario = new Arrendatario(2345, "Laura", "Gonzales", "Algo", 21, 10, "4772248145")
     arrendatario.mostrar()
     
   }
  
}