package com.mjduan.project.traitExample

/**
  * Hans 2017-07-30 01:54
  */
class Point(xc: Int, yc: Int) extends Equal {
   var x = xc
   var y = yc

   override def isNotEqual(x: Any): Boolean = !isEqual(x)

   override def isEqual(obj: Any): Boolean = obj.isInstanceOf[Point] &&
     obj.asInstanceOf[Point].x == x &&
     obj.asInstanceOf[Point].y == y
}
