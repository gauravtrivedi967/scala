object Max_Min_Multi 
{
   def main(args: Array[String])
    {
      println("To Find Min and Max from 7, 5")
      maxAndMin(7, 5);
    }
    def maxAndMin(a: Int, b: Int) = 
     {
       def findmax()=
         {
            def maxValue() = 
              {
                if(a > b)
                 {
                  println("Max is: " + a)
                 }
                else
                 {
                   println("Max is: " + b)
                 }
              }
         }
 
    def findmin()=
      {
        def minValue() = 
          {
            if (a < b)
              {
                println("Min is: " + a)
              }
            else
              {
                println("Min is: " + b)
               }
          }
      }
    findmax();
    findmin();
  }
}
