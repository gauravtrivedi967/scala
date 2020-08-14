object yeet {
  def main(args: Array[String]) {
    print("Enter a float value : ")
    var length = scala.io.StdIn.readFloat()
    length = length + 1
    println("Your entry + 1 : "+length)
  }
}