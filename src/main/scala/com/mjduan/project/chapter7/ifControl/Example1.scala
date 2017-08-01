package com.mjduan.project.chapter7.ifControl

/**
  * Hans 2017-08-01 22:48
  */
object Example1 {

   def main(args: Array[String]): Unit = {
      method1()
      method2(2)
      method3(true)
   }

   def method1(): Unit = {
      var i = "s"
      if (i.contains('d')) {
         println("contains d")
      } else {
         println("don't contains d")
      }
   }

   def method2(n: Int): Unit = {
      //This seems as JAVA's ':?'
      val result = if (n > 10) ">" else "<="
      println(result)
   }

   def method3(n: Boolean): Unit = {
      println(if (n) "true" else "false")
   }

}
