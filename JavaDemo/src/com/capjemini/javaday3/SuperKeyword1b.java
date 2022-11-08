package com.capjemini.javaday3;

class SuperKeyword1b extends SuperKeyword1a
{
 void message()
 {
 System.out.println("This is student class");
 }
 void display()
 {

 message();
 super.message();
 }
}
