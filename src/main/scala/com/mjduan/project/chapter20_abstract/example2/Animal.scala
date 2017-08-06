package com.mjduan.project.chapter20_abstract.example2

/**
  * Hans 2017-08-06 17:00
  */
abstract class Animal {

   type SuitableFood <: Food

   //The type of food is defined by the sub child
   def eat(food:SuitableFood)

}

class Food