package com.mjduan.project.unittest

import org.scalatest.{FlatSpec, Matchers}

import scala.collection.mutable

/**
  * Hans 2017-07-30 17:22
  */
class Example1 extends FlatSpec with Matchers{

   //Seems it doesn't work
   "A Stack" should " xxx" in{
      val stack = new mutable.Stack[Int]
      stack.push(1)
      stack.push(2)
      stack.pop() should be (2)
      stack.pop() should be (1)
      println("it' ok?")
   }

}
