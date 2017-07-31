package com.mjduan.project.chapter6.example1

/**
  * Hans 2017-07-31 23:29
  */
class Relational7(n: Int, d: Int) {
   require(d != 0)
   val number = n
   val denom = d

   //Constructor
   //this(n:Int) must precede to this(), because this() calling this(n:this)
   def this(n: Int) = {
      this(n, 1)
      println("after this(n:Int)")
   }

   def this() = {
      this(1)
      println("after this()")
   }

   override def toString: String = number + "/" + denom

   def add(that: Relational6) = new Relational6(this.number * that.denom + this.denom * that.number, this.denom * that.denom)


}
