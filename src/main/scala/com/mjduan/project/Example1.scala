package com.mjduan.project

/**
  * Hans 2017-08-07 21:18
  */
object Example1 {

   def main(args: Array[String]): Unit = {
      method1()
      method2()
      method3()
      method4()
      method5()
      method6()
   }

   private def method4() = {
      println("\nmethod4")
      def apply(f: Int => String, i: Int) = f(i)

      def layout[A](x: A) = "[" + x.toString + "]"

      println(apply(layout,10))
   }

   def method3() = {
      def addInt(num1: Int = 5, num2: Int = 4): Int = {
         num1 + num2
      }

      println("-----------method has default value--------------")
      println(addInt()) //9
      println("then")
      println(addInt(6)) //10
      println("then")
      println(addInt(7, 8)) //15
   }

   def method1() = {
      def printInt(a: Int, b: Int): Unit = {
         println("a=" + a)
         println("b=" + b)
      }

      printInt(b = 9, a = 7)
   }

   def method2() = {
      println("--------------------------")

      def printStrings(args: String*): Unit = {
         for (arg <- args)
            println(arg)
      }

      printStrings("one", "two", "three", "four")
   }

   def method5(): Unit ={
      var inc=(x:Int) => x+1

      println(inc(5))
   }

   def method6(): Unit ={
      println("\nmethod6,科里函数")
      //柯里转换函数接受多个参数成一条链的函数，每次取一个参数
      def strcat(s1:String)(s2:String)=s1+s2

      val s1="Hello "
      val s2="Scala"
      println("result="+strcat(s1)(s2))
   }


}
