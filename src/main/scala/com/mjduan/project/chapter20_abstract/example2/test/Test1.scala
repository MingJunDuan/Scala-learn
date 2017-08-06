package com.mjduan.project.chapter20_abstract.example2.test

import com.mjduan.project.chapter20_abstract.example2.animal.{Cow, Dog, DogFood, Grass}

/**
  * Hans 2017-08-06 17:09
  */
object Test1 {

   def method1() = {
      val cow = new Cow()
      cow.eat(new Grass)
   }

   def method2() = {
      val dog = new Dog()
      dog.eat(new DogFood)
   }

   def main(args: Array[String]): Unit = {
      method1()
      method2()
   }

}
