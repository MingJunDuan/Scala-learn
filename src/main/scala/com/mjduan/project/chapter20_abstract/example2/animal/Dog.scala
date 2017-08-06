package com.mjduan.project.chapter20_abstract.example2.animal

import com.mjduan.project.chapter20_abstract.example2.{Animal, Food}

/**
  * Hans 2017-08-06 17:04
  */
class Dog extends Animal{
   override type SuitableFood = DogFood

   override def eat(food: DogFood): Unit = {
      println("Dog eat DogFood")
   }
}

class DogFood extends Food
