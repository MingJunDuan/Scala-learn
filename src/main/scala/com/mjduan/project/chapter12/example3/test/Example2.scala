package com.mjduan.project.chapter12.example3.test

import com.mjduan.project.chapter12.example3.{BasicIntQueue, Doubling}

/**
  * Hans 2017-08-02 22:43
  */
object Example2 {

   def main(args: Array[String]): Unit = {
      val queue = new BasicIntQueue with Doubling
      queue.put(10)
      println(queue.get())
   }

}
