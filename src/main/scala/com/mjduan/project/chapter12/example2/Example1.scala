package com.mjduan.project.chapter12.example2

/**
  * Hans 2017-08-02 22:27
  */
object Example1 {

   def method1() = {
      val rational1 = new Rational(1,2)
      val rational2 = new Rational(1,3)
      println(rational1<rational2)
      println(rational1>rational2)
      println(rational1==rational2)
   }

   def main(args: Array[String]): Unit = {
      method1()
   }

}
