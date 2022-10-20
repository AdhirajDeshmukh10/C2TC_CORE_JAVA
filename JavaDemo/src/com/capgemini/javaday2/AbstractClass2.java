package com.capgemini.javaday2;

abstract class Origin
{
	Origin()
		{
			System.out.println("Base Constructor Called");
		}
		abstract void fun();
}


class Emerged extends Origin
{
	Emerged()
		{
			System.out.println("Derived Constructor Called");
		}
		void fun()
		{
			System.out.println("Derived fun() called");
		}
}


public class AbstractClass2 
{

	public static void main(String[] args)
	{
		Emerged d = new Emerged();

	}

}
