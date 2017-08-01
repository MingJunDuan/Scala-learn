package com.mjduan.project.chapter6.example1

/**
  * Hans 2017-08-01 22:28
  */
class Relational10(n: Int, d: Int) {
   require(d != 0)
   //private variable, it's only visibly within class
   private val g = gcd(n.abs, d.abs)
   //public variable
   val number = n / g
   //public variable
   val denom = d / g


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

   def +(that: Relational10) = new Relational10(this.number * that.denom + this.denom * that.number, this.denom * that.denom)

   def +(i: Int) = new Relational10(number + i * denom, denom)

   def -(that: Relational10) = new Relational10(number * that.denom - denom * that.number, denom * that.denom)

   def -(i: Int) = new Relational10(number - i * denom, denom)

   def *(that: Relational10) = new Relational10(number * that.number, denom * that.denom)

   def *(i: Int) = new Relational10(number * i, denom)

   //private method, it's only visibly within class
   private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}
