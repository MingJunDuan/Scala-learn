package com.mjduan.project.traitExample.test

import com.mjduan.project.traitExample.Point

/**
  * Hans 2017-07-30 01:59
  */
object Test1 {

   def main(args: Array[String]): Unit = {
      val point = new Point(2,3)
      val point1 = new Point(2,4)

      println(point.isEqual(point1))
      println(point.isNotEqual(point1))
      println(point.method1())
   }

}
