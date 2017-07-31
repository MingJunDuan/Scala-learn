package com.mjduan.project.chapter6.example1

/**
  * Hans 2017-07-31 23:26
  */
class Relational6(n:Int,d:Int){
   require(d!=0)
   val number = n
   val denom = d

   override def toString: String = number+"/"+denom

   def add(that:Relational6) =
      new Relational6(this.number*that.denom+this.denom*that.number,this.denom*that.denom)

}
