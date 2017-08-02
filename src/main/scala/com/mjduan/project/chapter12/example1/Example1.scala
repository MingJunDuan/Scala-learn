package com.mjduan.project.chapter12.example1

/**
  * Hans 2017-08-02 22:13
  */
object Example1 {


   def method1() = {
      val rectangle = new Rectangle(new Point(1,1),new Point(10,10))
      val left = rectangle.topLeft
      println(left)
      val right = rectangle.bottomRight
      println(right)

   }

   def main(args: Array[String]): Unit = {
      method1()
   }

}
