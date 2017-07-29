package com.mjduan.project.extendsAndOverride.example1

/**
  * Hans 2017-07-30 00:16
  */
class Point(xc: Int, yc: Int) {

   var x = xc
   var y = yc

   def move(dx: Int, dy: Int): Unit = {
      x += dx
      y += dy
      println("x:" + x)
      println("y:" + y)
   }

}
