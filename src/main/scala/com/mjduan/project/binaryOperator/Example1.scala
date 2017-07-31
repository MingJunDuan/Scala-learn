package com.mjduan.project.binaryOperator

/**
  * Hans 2017-07-31 22:35
  */
object Example1 {

   def main(args: Array[String]): Unit = {
      method1()
   }

   def method1(): Unit ={
      val i = -1 >> 31
      assert(i == -1)

      val j = -1 >>> 31
      assert(j == 1)

      val k = 1<<2
      assert(k == 4)
   }

}
