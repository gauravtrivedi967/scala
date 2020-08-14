object readLineDemo {
 def main(args: Array[String])
 {
  while (true) {

      val result = scala.io.StdIn.readLine()
      printf("You have entered: %s", result)
      println()
    }
  }
}
