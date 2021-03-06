object TryMaps {
  def main(args: Array[String]): Unit = {
    val m1 = Map("The"->10, "Color"->20,"Gradient"->30)
    println("Get method on map m1 : " + m1.get("Color"))
    val iter = Iterator(3, 6, 15, 19, 21) 
    val iter1 = iter.map(x=>{x*3})
    println("Using Iterator : " + iter1.next())
    println("Method addString on map m1 : " + m1.addString(new StringBuilder()))
    println("Method addString on iter with sep " +iter.addString(new StringBuilder(), "#"))
    println("Apply Method on map m1 "+m1.apply("The"))
    val m2 = scala.collection.mutable.Map("Dog" -> 5,"Cat" -> 3, "Shark" -> 1) 
    println("Using clear " +m2.clear())
    println("Using clone " + m2.clone())
    val map: Map[Int,Int] = Map(2 -> 3) 
    println("Using  contains " +map.contains(2)) 
    val x: Array[Any] = Array(0, 0, 0, 0, 0)  
    m1.copyToArray(x)  
    print("CopyToArray ")
    for(k <- x)
      print(k+" ")
    println()
    println("Using count "+  m1.count(z=>true))
    println("Using Drop " + m1.drop(1))
    println("Using DropRight " + m1.dropRight(1))
    println("Using DropWhile "+ m1.dropWhile(z=>false))
    println("Using Empty " + m1.empty)
    val m1cpy = Map("The"->10, "Color"->20,"Gradient"->30)
    println("Using Equals to check if map m1 and m1cpy are equal?? --> " + m1.equals(m1cpy))
    println("Using exists --> "+m2.exists(x => x._1 == "for" && x._2 == 3))
    val mm = Map(5 -> "uniform", 4 -> "for", 2 -> "cs")
    println("Using filterKeys " + mm.filterKeys(_ > 2))
    println("Using for "+mm.find(_._2 == "for"))
    println("Using foreach")
    println(mm.foreach(x => println("key=" + x._1 + ", value=" + x._2)))
    println("Using init "+m1.init)
    println("Using isEmpty --> "+mm.isEmpty)
    println("Using Keys "+ m1.keys)
    println("Using last "+ m1.last)
    println("Using Max "+mm.max)
    println("Using Min "+mm.min)
    println("Using mkString " + m1.mkString)
    println("Product Map Values --> "+ mm.foldLeft(1)(_*_._1))
    println("Remove key value from Map " +  m1.-("Gradient"))
    val mi = scala.collection.mutable.Map(3 -> "Garden",1 -> "Walk", 2 -> "Room") 
    println("Using retain "+mi.retain((key,value) => key > 1))
    println("Using size --> " +  m1.size)
    println("sum Map values "+ mm.foldLeft(0)(_+_._1))
    println("Using function tail in map mm : " + mm.tail)
    println("Using function take in map mm : " + mm.take(2))
    println("Using takeRight on map mm : " + mm.takeRight(2))
    val l1 = List(1, 2, 3, 4, 5, 7) 
    println("Using TakeWhile : "+l1.takeWhile(_ < 5))
    print("Using toArray ")
    val res = mm.toArray
    for(k <- res)
      print(k+" ")
  }
}