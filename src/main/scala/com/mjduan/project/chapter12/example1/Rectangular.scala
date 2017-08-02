package com.mjduan.project.chapter12.example1

/**
  * Hans 2017-08-02 22:11
  */
trait Rectangular {

   def topLeft():Point

   def bottomRight():Point

   def left()=topLeft().x

   def right()=bottomRight().x

   def width()=right()-left()

}
