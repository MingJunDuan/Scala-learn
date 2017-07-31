package com.mjduan.project.application

/**
  * Hans 2017-07-31 22:26
  */
//There is a main method in App.class. App is a trait
object HelloApp extends App{

   //Will print the element
   for (season<-List("Winter","Spring","Summer","Fall")){
      println("Season:"+season)
   }

   //This method won't been called
   def method1(): Unit ={
      println("method1")
   }

   val s = "variables"
   //s will been printed
   println(s"s is '$s'")
}
