package com.capgemini.javaday2;

public class Tkclass4 {

	int a;
	 int b;
	 //Default constructor
	 Tkclass4()
	 {
		 a = 10;
		 b = 20;
	 }

	 //Method that returns current class instance
	 Tkclass4 get()
	 {
	 return this;
	 }

	 //Displaying value of variables a and b
	 void display()
	 {
	 System.out.println("a = " + a + " b = " + b);
	 }

	}


