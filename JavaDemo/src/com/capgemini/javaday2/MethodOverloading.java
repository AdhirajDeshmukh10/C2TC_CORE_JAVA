package com.capgemini.javaday2;

public class MethodOverloading 
{
	void add(int x,int y)
	{
		System.out.println("Add is "+(x+y));
		
	}
	
	void add(int x,int y,int z)
	{
		System.out.println("Add is "+(x+y+z));
		
	}

	public static void main(String[] args) 
	{
		MethodOverloading obj = new MethodOverloading();
		obj.add(5,4);
		obj.add(5,5,4);

	}

}
