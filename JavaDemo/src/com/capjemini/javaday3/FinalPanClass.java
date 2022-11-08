package com.capjemini.javaday3;

public class FinalPanClass extends FinalPan2
{
	void m1() // void m2() – cannot be called
	{
		System.out.println("S m1");
	}
	public static void main(String[] args)
	{
		FinalPanClass obj = new FinalPanClass();
		obj.m1();
		obj.m2();
	}
}