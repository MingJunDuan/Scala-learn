package com.mjduan.project

/**
  * Hans 2017-08-09 07:29
  */
object Example2 {

    def main(args: Array[String]): Unit = {
        method1()
        method2()
    }

    def method1() = {
        val factor = 3
        //闭包
        val multiplier = (i: Int) => i * factor
        println(multiplier(2))
        println(multiplier(3))
    }

    def method2() = {
        val array = new Array[String](3)
        array(0) = "one"
        array(1) = "two"
        array(2) = "three"
        println(array(2))
        array(2) = "2"
        println(array(2))
        val myList = Array(1, 2, 3, 4, 5)
        myList.foreach(println)
        val array1 = Array(1, 2)
        val array2 = Array(3, 4)
        val array3 = Array.concat(array1, array2)
        array3.foreach(println)
        val a1 = Array.range(10, 20)
        val a2 = Array.range(10, 20, 2)
        println("-------a1:")
        a1.foreach(i => print(" " + i))
        println("\n-------a2")
        a2.foreach(i => print(" " + i))
    }

}
