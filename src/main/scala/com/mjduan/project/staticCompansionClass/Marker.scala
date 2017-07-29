package com.mjduan.project.staticCompansionClass

/**
  * Hans 2017-07-30 01:21
  */
class Marker private(val color: String) {
   println("create " + this)

   override def toString: String = "Color :"+color

}
