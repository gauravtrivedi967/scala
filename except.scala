object except {
  def main(args:Array[String])
  {
    println("36.try is a keyword")
    println("37.throw is a keyword")
    println("38. _ is keyword")
    println("39.case is a keyword")
    println("40.catch is a keyword")
    try {
      // Throw an Exception.
      throw new Exception("Failure")
    } catch {
      // Catch all Throwable exceptions.
      case _: Throwable => println("An exception was thrown")
    }
  }
}