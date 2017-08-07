package com.mjduan.project.binaryOperator

/**
  * Hans 2017-07-31 22:35
  */
object Example1 {

   def main(args: Array[String]): Unit = {
      method1()
      method2()
   }

   def method1(): Unit ={
      val i = -1 >> 31
      assert(i == -1)

      val j = -1 >>> 31
      assert(j == 1)

      val k = 1<<2
      assert(k == 4)
   }

   def method2(): Unit ={
      val a=60
      val b=13

      println(a&b)//12   &只有对应位都为1时，值才是1
      println(a|b)//61   |只要有一位是1，那么这个对应位的值位1
      println(a^b)//49   ^只有俩个对应位位1，那么直才是1
      println(~a)//-61   ~对a的每位二进制位取反
   }

}
