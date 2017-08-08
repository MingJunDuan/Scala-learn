package com.mjduan.project

/**
  * Hans 2017-08-09 07:29
  */
object Example2 {

   def method1() = {
      val factor = 3
      //闭包
      val multiplier = (i:Int)=>i*factor

      println(multiplier(2))
      println(multiplier(3))
   }

   def main(args: Array[String]): Unit = {
      method1()
   }

}
