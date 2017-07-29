package com.mjduan.project.extendsAndOverride.example2

/**
  * Hans 2017-07-30 00:45
  */
class Employee extends Person{
   var salary = 0.0

   override def toString: String = super.toString+"[salary="+salary+"]";

}
