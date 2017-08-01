package com.mjduan.project.chapter6.example1

/**
  * Hans 2017-08-01 22:37
  */
object Relation10 {

   def main(args: Array[String]): Unit = {
      val relational = new Relational10()

      val relational1 = relational*relational
      println(relational)
   }

}
