object NumberAddition {
 def main(args: Array[String]) 
 {
  println("Sum is: " + functionToAdd(10,15));
 }
  def functionToAdd(a:Int, b:Int) : Int =
 {
   var sum:Int = 0
   sum = a + b
   return sum

  }
}