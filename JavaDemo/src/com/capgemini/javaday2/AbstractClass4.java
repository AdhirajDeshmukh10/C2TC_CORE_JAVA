package com.capgemini.javaday2;

abstract class firstone
{
				final void fun()
{
System.out.println("Derived fun() called");
}
}
		
class newemerged extends firstone
{
}

public class AbstractClass4 {

	public static void main(String[] args)
	{
		
		firstone b = new newemerged();
		 b.fun();
	}

}
