object Even_odd_single {
    def main(args:Array[String])
    {
    val n= scala.io.StdIn.readInt()
    //println(n);
    checkOddEven(n);
    }

def checkOddEven(n: Int) = {
    def nestedCheckoddEven(n:Int)={
         if(n%2==0)
        println("Even number")
        else
        println("Odd number")
    }
    nestedCheckoddEven(n);
}
}