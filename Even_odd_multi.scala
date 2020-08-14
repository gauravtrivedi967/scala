object Even_odd_multi {
  def main(args:Array[String])
    {
    val n= scala.io.StdIn.readInt()
    checkOddEven(n);
    }

def checkOddEven(n: Int) = {
    def nestedCheckoddEven(n:Int)={
    def nested2CheckoddEven(n:Int)={
         if(n%2==0)
        println("Even number")
        else
        println("Odd number")
    }
    nested2CheckoddEven(n);
    }
    nestedCheckoddEven(n);
}
}