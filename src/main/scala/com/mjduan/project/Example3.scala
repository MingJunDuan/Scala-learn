package com.mjduan.project

/**
  * Hans 2017-08-09 10:11
  */
object Example3 {
    def method1() = {
        def show(x:Option[String]):String= x match {
            case Some(s)=>s
            case None=>"?"
        }
        val capitals = Map("France"->"Paris","Japan"->"Toky")
        println(show(capitals.get("France")))
        println(show(capitals.get("unknown key")))
    }

    def method2() = {
        val capitals = Map("France"->"Paris","Japan"->"Toky")
        println(capitals.get("China").getOrElse("BeiJing"))
        println(capitals.get("unknown key").getOrElse("unknown"))
        val i = capitals.get("key").map(k=>k.length).getOrElse(-1)
        println(i)
    }

    def main(args: Array[String]): Unit = {
        method1()
        method2()
    }

}
