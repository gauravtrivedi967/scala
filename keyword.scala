import scala.util.control._
object keyword {
 def main(args: Array[String]) {
      var a = 0;
      printf("1.List is a keyword")
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      val loop = new Breaks;
      println("2.new is keyword")
      println("3.for is keyword")
      println("4.= is a keyword")
      println("5.<- is a keyword")
      println("6.break is a keyword")
      loop.breakable {
         for( a <- numList){
            println( "Value of a: " + a );
            
            if( a == 4 ){
               loop.break;
            }
         }
      }
   }
 }
 