
object sets {
  def main(args: Array[String]): Unit = {
    
    val num1 = Set(1,2,3,4,5,6,7)
    val num2 = Set(10,20,3,40,50,60,7)
    
    println("num1.&(num2) : " + num1.&(num2))
    println("num1.intersect(num2) : " + num1.intersect(num2))
    
    println("apply 1 on num1 " + num1.apply(1))
    println("apply -4 on num2 " + num2.apply(-4))
    
    println("Count " + num1.count(x => {x % 3 != 0}))
    
    val arr: Array[Int] = Array(0, 0, 0, 0, 0,0,0) 
    
    num1.copyToArray(arr)
    print("CopyToArray from num1 set to array arr ")
    for(ele <- arr)
      print(ele+" ")
    println()
    val diff = num1.diff(num2)
    println("num1 set difference num2 set "+ diff)
    
    println("Drop 3 elements from num1 : "+ num1.drop(3))
    
    val s2 = num1.dropRight(1)
    print("all elements except last ‘n’ elements from set num1- ")
    for(ele <- s2)
      print(ele+" ")
    println()
    
    println("Is set num1 and num2 are equal?? --> " + num1.equals(num2))
    
    println("if the stated predicate holds true for some elements in num1-->> " + num1.exists(y => {y % 3 == 0}))
    
    println("set containing all the elements of the set num1 which satisfies the given predicate.--> " + num1.filter(_ < 10))
    
    println("he first element of the set num2 which satisfies the given predicate. --> " + num2.find(_ == 3))
    
    println("true if the stated predicate holds true for all the elements of the set num2 else it returns false.--> " + num2.forall(y => {y % 3 == 0}))
    print("all the elements of the set num1 after applying the given function to each of them. " + num1.foreach(x => print(x+" ")))
    println()
    println("the first element of the set num1 "+ num1.head)
    
    println("all the elements of the set num1 except the last one " + num1.init)
    
    println("a set containing the elements present in both the sets num1 and num2 " + num1.intersect(num2))
    
    println("Check if the set num2 is empty---> " + num2.isEmpty)
  
  }
}