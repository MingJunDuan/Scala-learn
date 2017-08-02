package com.mjduan.project.chapter12.example3.test

import com.mjduan.project.chapter12.example3.{BasicIntQueue, Filtering, Incrementing}

/**
  * Hans 2017-08-02 22:46
  */
object Example3 {

   def main(args: Array[String]): Unit = {
      //最右边的trait会被调用, first filter then increment
      //Filtering 里面调用了super，所以super.put调用了Incrementing里面的put
      val queue = new BasicIntQueue with Incrementing with Filtering
      queue.put(-1)
      queue.put(0)
      queue.put(1)

      println(queue.get())
      println(queue.get())

      println("-----------------------")
      //first incrementing then filter
      val queue1 = new BasicIntQueue with Filtering with Incrementing
      queue1.put(-1)
      queue1.put(0)
      queue1.put(1)

      println(queue1.get())
      println(queue1.get())
      println(queue1.get())
   }

}
