package com.mjduan.project.extendsAndOverride.example1

/**
  * Hans 2017-07-30 00:19
  */
object Test1 {

   def main(args: Array[String]): Unit = {
      val point = new Point(10, 20)
      point.move(10, 10)

      val location = new Location(10,20,30)
      location.move(10,10,10)
   }

}
