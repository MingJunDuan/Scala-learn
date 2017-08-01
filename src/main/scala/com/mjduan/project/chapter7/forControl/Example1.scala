package com.mjduan.project.chapter7.forControl

/**
  * Hans 2017-08-02 00:00
  */
object Example1 {

   def method2() = {
      for(i<-1 until 9 )
         println(i)
   }

   def method3() = {
      //filter
      for (i<- 1 until 8 if i%2==0){
         println(i)
      }
   }

   def method4() = {
      println("method4")
      for (i<-0 until 12 if i%2==0; if i%3==0)
         println(i)
   }

   def main(args: Array[String]): Unit = {
      method1()
      method2()
      method3()
      method4()
   }

   def method1(): Unit ={
      for (i<- 0 to 8)
         println(i)
   }

}
