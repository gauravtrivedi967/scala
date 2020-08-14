object last_prog {
   def main(args: Array[String])  
    { 
        var myfc1 = (n:Int) => n + 1
        println(myfc1(1)) 
        var myfc2 =(n:Int) => if(n==0) println("YES") else println("NO")
        myfc2(9)
        var myfc3=(a:Int,b:Int)=>println("Addition is "+(a+b)+"\nMultiplication is "+a*b)
        myfc3(2,3)
    } 
}