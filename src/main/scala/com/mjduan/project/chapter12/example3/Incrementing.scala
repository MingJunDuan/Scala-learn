package com.mjduan.project.chapter12.example3

/**
  * Hans 2017-08-02 22:44
  */
trait Incrementing extends IntQueue{

   abstract override def put(x: Int) = super.put(x+1)

}
