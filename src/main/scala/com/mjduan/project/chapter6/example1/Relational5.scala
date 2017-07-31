package com.mjduan.project.chapter6.example1

/**
  * Hans 2017-07-31 23:16
  */
class Relational5(n: Int, d: Int) {
   //If the d is zero, then IllegalArgumentException will been thrown and construction will fail
   require(d != 0)

   override def toString: String = n + "/" + d

}
