package com.mjduan.project.chapter20_abstract.example2.animal

import com.mjduan.project.chapter20_abstract.example2.{Animal, Food}

/**
  * Hans 2017-08-06 17:01
  */
class Cow extends Animal{
   override type SuitableFood = Grass

   override def eat(food: Grass): Unit = {
      println("Cow eat Grass")
   }
}

class Grass extends Food
