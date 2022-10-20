package com.capgemini.javaday2;

abstract class Foundation
{		
				void fun()
{
System.out.println("Base fun() called");
}
}
		
class Born extends  Foundation
{
}

public class AbstractClass3 {

	public static void main(String[] args)
	{
		Born d = new Born();
		d.fun();

	}

}
