package com.mjduan.project.chapter20_abstract.example3

/**
  * Hans 2017-08-06 17:17
  */
object Test {

   def main(args: Array[String]): Unit = {
      method1()
   }

   //error
   def method1() = {
      for (color <- Direction2)
         println(color)
   }

}
