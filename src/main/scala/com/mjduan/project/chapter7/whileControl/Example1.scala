package com.mjduan.project.chapter7.whileControl

/**
  * Hans 2017-08-01 22:54
  */
object Example1 {

   def main(args: Array[String]): Unit = {
      method1()
      method2()
   }

   def method1(): Unit ={
      var i = 1
      while (i<10){
         println(i)
         i +=1
      }
   }

   def method2(): Unit ={
      var j = 0
      do {
         println(j)
         j+=1
      } while (j<10)
   }

}
