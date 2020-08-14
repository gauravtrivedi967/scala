object keyword_2 {
    def main(args : Array[String])
    {
    println("7.def is a keyword")
    println("8.Object is a keyword")
    println("9.Var is a keyword")
    println("10.True is a keyword")
    println("11.false is a keyword")
    var one: Boolean = true
    var two: Byte = 120
    var three: Float = 1.5526f 
    var four: Int = 5
    var five: Short = 40
    var six: Double = 3.14159265
    var seven: Char = 'A'
    var eight: Short = 100
    val nine : Long= 259456877
    val ten: String = "new key word"
    lazy val lval = 10
    println("12.Print is a keyword")
    print("13.Printf is a keyword")
    printf("14.Val is a keyword")
    println()
    println("15.if is a keyword")
    println("16.else is a keyword")
    if (one == true)  
    { 
    println("Boolean values can be true or false") 
    } 
    else{
      println()
    }
    println("17.byte are 8 bit signed value : " + two) 
    println("18.float are 32 bit single precision values : " + three) 
    println("19.integer are 32 bit signed values : " + four) 
    println("20.short are 16 bit signed values : " + five) 
    println("21.double are 64 bit double precision values : " + six) 
    println("22.char are 16 bit unsigned unicode character : " + seven) 
    println("23.char are 16 bit signed value : " + eight) 
    println("24.Long is 64 bit signed value : "+ nine)
    println("25.String is a keyword : "+ ten)
    println("26.lazy val : "+lval)
    println("A val  can be declared as lazy by using the lazy keyword.")
    println("27.Println is keyword")
}
}