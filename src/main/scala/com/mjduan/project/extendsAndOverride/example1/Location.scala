package com.mjduan.project.extendsAndOverride.example1

/**
  * Hans 2017-07-30 00:29
  */
class Location(val xc: Int, val yc: Int, val zc: Int)
  extends Point(xc, yc) {
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int): Unit = {
      x += dx
      y += dy
      z += dz

      println("x:" + x + "\ty:" + y + "\tz:" + z)
   }

}
