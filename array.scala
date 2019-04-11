package num1

object array {
  def main(args:Array[String]) = {
    var mDim = Array.ofDim[Int](3,3)
    
    for ( i <- (0 until 3)){
      for (j <- (0 until 3)){
        mDim(i)(j) = j + 1
      }
    }

    for ( i <- (0 until 3)){
      for (j <- (0 until 3)){
        print(mDim(i)(j))
      }
      println()
    }
    
    val diagonal:Int = mDim(0)(0) + mDim(1)(1) + mDim(2)(2)
    println(diagonal)
    
  }
}