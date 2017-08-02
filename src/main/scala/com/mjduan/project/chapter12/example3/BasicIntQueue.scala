package com.mjduan.project.chapter12.example3

import scala.collection.mutable.ArrayBuffer

/**
  * Hans 2017-08-02 22:38
  */
class BasicIntQueue extends IntQueue{
   private val buf = new ArrayBuffer[Int]()

   override def get(): Int = buf.remove(0)

   override def put(x: Int): Unit = buf+=x
}
