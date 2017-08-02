package com.mjduan.project.chapter12.example3.test

import com.mjduan.project.chapter12.example3.BasicIntQueue

/**
  * Hans 2017-08-02 22:40
  */
object Example1 {

   def main(args: Array[String]): Unit = {
      val queue = new BasicIntQueue
      queue.put(10)
      queue.put(20)

      println(queue.get())
      println(queue.get())
   }

}
