package com.mjduan.project.traitExample

/**
  * Hans 2017-07-30 01:51
  */
trait Equal {

   def isEqual(x:Any):Boolean

   def isNotEqual(x:Any):Boolean

   def method1(): Boolean ={
      println("method1")
      return true
   }

}
