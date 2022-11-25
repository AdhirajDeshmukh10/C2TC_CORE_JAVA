package com.capjemini.javaday8;
interface Lambda 
{
	public void demo();
	
}

public class Lam1 {

	public static void main(String[] args) {
		Lambda obj=()->
		{System.out.println("I am from Akola Batch");
		System.out.println("I am from Akola Batch");
		System.out.println("I am from Akola Batch");
		System.out.println("I am from Akola Batch");
		};
		obj.demo();

	}

}
