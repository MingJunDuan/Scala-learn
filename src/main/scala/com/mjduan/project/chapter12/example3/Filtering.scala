package com.mjduan.project.chapter12.example3

/**
  * Hans 2017-08-02 22:45
  */
trait Filtering extends IntQueue{

  abstract override def put(x: Int) = if (x>=0) super.put(x)

}
