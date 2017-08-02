package com.mjduan.project.chapter12.example2

/**
  * Hans 2017-08-02 22:23
  */
//Ordered trait
class Rational(n: Int, d: Int) extends Ordered[Rational] {
   val number = n
   val demon = d

   override def compare(that: Rational): Int = {
      this.number * that.demon - this.demon * that.number
   }
}
