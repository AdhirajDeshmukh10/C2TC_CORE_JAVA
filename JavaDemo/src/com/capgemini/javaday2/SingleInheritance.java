package com.capgemini.javaday2;

class First
{
	void disp1()
	{
		System.out.println("One");
	}
}

class Second extends First
{
	void disp2()
	{
		System.out.println("Two");
	}
}

public class SingleInheritance 
{
	public static void main(String[] args)
	{
		
		Second obj = new Second();
		obj.disp1();
		obj.disp2();

	}

}
