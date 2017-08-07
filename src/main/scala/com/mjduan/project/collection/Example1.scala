package com.mjduan.project.collection

/**
  * Hans 2017-08-07 21:07
  */
object Example1 {

   def method1() = {
      var a=0
      val numList = List(1,2,3,4,5,6,7,8,9)
      val retVal = for(a<-numList if a!=3; if a<8) yield a

      retVal.foreach(println _)
   }

   def main(args: Array[String]): Unit = {
      method1()
   }

}
