package com.mjduan.project

/**
  * Hans 2017-08-07 21:18
  */
object Example1 {

   def method1() = {
      def printInt(a:Int,b:Int): Unit ={
         println("a="+a)
         println("b="+b)
      }

      printInt(b=9,a=7)
   }

   def main(args: Array[String]): Unit = {
      method1()
   }

}
