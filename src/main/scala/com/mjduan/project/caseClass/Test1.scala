package com.mjduan.project.caseClass

/**
  * Hans 2017-07-30 02:08
  */
object Test1 {

   case class Person(name:String,age:Int)

   def main(args: Array[String]): Unit = {
      val person = new Person("A",10)
      val person1 = new Person("B",11)
      val person2 = new Person("C",12)

      for (p<-List(person,person1,person2)){
         p match {
            case Person("A",10)=>println("A match")
            case Person("B",11)=>println("B match")
            case Person(name,age)=>println("Name:"+name+" age:"+age)
         }
      }


   }

}
