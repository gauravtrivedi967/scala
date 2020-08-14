case class Book (name:String, author:String) 
object colour {
  def main(args: Array[String]) 
    { 
        println("28.case is a keyword")
        println("29.Object is a keyword")
        var Book1 = Book("Data Structure", "Narshima Karumachi") 
        var Book2 = Book("Computer Networking", "Tanenbaum") 
         
        println("Name of the Book1 is " + Book1.name); 
        println("Author of the Book1 is " + Book1.author); 
        println("Name of the Book2 is " + Book2.name); 
        println("Author of the Book2 is " + Book2.author); 
    } 
}