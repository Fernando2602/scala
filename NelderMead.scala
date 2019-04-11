package num1
import java.lang.Math

case class Point2D(x:Double, y:Double, func:(Double,Double) => Double){
  
    def obtenerZ():Double = {
      func(x,y)
    } 

}

object NelderMead{
	def main(args:Array[String]){
    val sphere = (x:Double, y:Double) => {Math.pow(x,2) + Math.pow(y,2)}
    val example = (x:Double, y:Double) => {Math.pow(x,2) - 4*x + Math.pow(y,2) - y - x*y}
    val Rosenbrock = (x:Double, y:Double) => {Math.pow((1-x),2) + 100*Math.pow((y-Math.pow(x,2)),2)  }  
	
    println("Funcion: sphere")
    metodo(sphere)
    println("Funcion: example")
	  metodo(example)
    println("Funcion: Rosenbrock")
	  metodo(Rosenbrock)
    
    
	}
	
	def metodo(ejemplo:(Double,Double) => Double){
    var indexB:Int = 0
    var indexG:Int = 0
    var indexW:Int = 0

    var E:Double = 0.0
    var C:Double = 0.0
    var S:Double = 0.0
    
    var punto = new Point2D(1.0, 0.0, ejemplo)    
    var punto1 = new Point2D(5.0, 0.0, ejemplo)    
    var punto2 = new Point2D(0.0, 5.0, ejemplo)    

    var puntoC = new Point2D(0.0, 0.0, ejemplo)
    
    var points:Array[Point2D] = new Array[Point2D](3)

    var i:Int = 1
    //Inicio del bucle
    do{
      points(0) = punto
      points(1) = punto1
      points(2) = punto2      
      
      var B = points(0).obtenerZ()
      indexB = 0
      //For para calcular Best
      for (count <- 0 to 2){
        if (points(count).obtenerZ() < B){
           B = points(count).obtenerZ()
           indexB = count
        }
      }
  
      var W = points(0).obtenerZ()
      indexW = 0
      //For para calcular Worst
      for (count <- 0 to 2){
        if (points(count).obtenerZ() > W){
          W = points(count).obtenerZ()
          indexW = count        
        }
      }        
      
      var G = points(0).obtenerZ()
      indexG = 0
      //For para calcular Good
      for (count <- 0 to 2){
        if (count != indexB && count != indexW){
          G = points(count).obtenerZ()    
          indexG = count
        }
      }

      var puntoM = new Point2D(((points(indexB).x + points(indexG).x) / 2), ((points(indexB).y + points(indexG).y) / 2), ejemplo)
      var M = puntoM.obtenerZ()

      var puntoR = new Point2D((2.0 * puntoM.x - points(indexW).x), (2.0 * puntoM.y - points(indexW).y), ejemplo)
      var R = puntoR.obtenerZ()
      
      //Condiciones
      if (R < G){
        if (B < R){
            W = R
            punto = new Point2D(puntoR.x, puntoR.y, ejemplo)    
            punto1 = new Point2D((points(indexB).x), (points(indexB).y), ejemplo)    
            punto2 = new Point2D((points(indexG).x), (points(indexG).y), ejemplo)    
        }else{
      	  var puntoE = new Point2D((2*puntoR.x - puntoM.x), (2*puntoR.y - puntoM.y), ejemplo)
          E = puntoE.obtenerZ()
          if (E < B){
            W = E
            punto = new Point2D(puntoE.x, puntoE.y, ejemplo)    
            punto1 = new Point2D((points(indexB).x), (points(indexB).y), ejemplo)    
            punto2 = new Point2D((points(indexG).x), (points(indexG).y), ejemplo)    

          }else{
            W = R
            punto = new Point2D(puntoR.x, puntoR.y, ejemplo)    
            punto1 = new Point2D((points(indexB).x), (points(indexB).y), ejemplo)    
            punto2 = new Point2D((points(indexG).x), (points(indexG).y), ejemplo)    
          }
        }
      }else{
        if (R < W){
          W = R
          punto = new Point2D(puntoR.x, puntoR.y, ejemplo)    
          punto1 = new Point2D((points(indexB).x), (points(indexB).y), ejemplo)    
          punto2 = new Point2D((points(indexG).x), (points(indexG).y), ejemplo)              
        }
        var puntoC1 = new Point2D(((points(indexW).x + puntoM.x)/2), ((points(indexW).y + puntoM.y)/2), ejemplo) 
        var puntoC2 = new Point2D(((puntoR.x + puntoM.x)/2), ((puntoR.y + puntoM.y)/2), ejemplo) 
        //Evaluar la C mas grande
        if (puntoC2.obtenerZ() < puntoC1.obtenerZ()){
          C = puntoC1.obtenerZ()  
          puntoC = puntoC1          
        }else{
          C = puntoC2.obtenerZ()  
          puntoC = puntoC2            
        }
        if (C < W){
          W = C
          punto = new Point2D(puntoC.x, puntoC.y, ejemplo)    
          punto1 = new Point2D((points(indexB).x), (points(indexB).y), ejemplo)    
          punto2 = new Point2D((points(indexG).x), (points(indexG).y), ejemplo)    
        }else{
          var puntoS = new Point2D(((points(indexB).x + points(indexW).x)/2), ((points(indexB).y + points(indexW).y)/2), ejemplo) 
          S = puntoS.obtenerZ()
          W = S
          G = M
          punto = new Point2D(puntoS.x, puntoS.y, ejemplo)    
          punto1 = new Point2D(puntoM.x, puntoM.y, ejemplo)    
          punto2 = new Point2D((points(indexB).x), (points(indexB).y), ejemplo)    
        }
        
      }
      
    i += 1
    }while (distancia(points(indexB),points(indexG)) > 0.001);

    println("Total de iteraciones: " + i)
    printf("Coordenada x: %.1f, Coordenada y: %.1f\n\n", punto.x, punto.y)
  	  
	}

	def distancia(punto1:Point2D, punto2:Point2D):Double = {
	  var Dis = Math.sqrt(Math.pow((punto1.x - punto2.x),2) + Math.pow((punto1.y - punto2.y),2))
	  Dis
  }

}


