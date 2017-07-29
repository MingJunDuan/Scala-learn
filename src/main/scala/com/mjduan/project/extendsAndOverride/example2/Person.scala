package com.mjduan.project.extendsAndOverride.example2

/**
  * Hans 2017-07-30 00:44
  */
class Person {

   var name=""

   override def toString: String = getClass.getName+"[name="+name+"]";
}
