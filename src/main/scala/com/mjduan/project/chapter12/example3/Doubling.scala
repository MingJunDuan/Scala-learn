package com.mjduan.project.chapter12.example3

/**
  * Hans 2017-08-02 22:41
  */
trait Doubling extends IntQueue{

   abstract override def put(x: Int) = super.put(2*x)

}
