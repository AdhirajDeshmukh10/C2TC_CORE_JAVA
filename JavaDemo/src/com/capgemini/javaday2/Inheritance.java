package com.capgemini.javaday2;

class Super
{
	void disp()
	{
		System.out.println("Super class");
	}
}

class Subclass extends Super
{
	@Override
	void disp()
	{
		super.disp();

	}
}

public class Inheritance 
{

	public static void main(String[] args)
	{
		Subclass obj  = new Subclass();
		obj.disp();

	}

}
