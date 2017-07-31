package com.mjduan.project.chapter6.example1

/**
  * Hans 2017-07-31 23:05
  */
class Relational4(n:Int,d:Int) {

   /**
     * Scala compiler将类内部的任何既不是字段，也不是方法的代码全都编译到主构造器中
     */

   println(s"n=$n\t d=$d")

   var i = 90
   i =i+5
   val j = 5
   i =i+5

   println(s"i=$i")

}
