package com.capjemini.javaday3;

public class InstanceOpMain
{

	public static void main(String[] args)
	{
		InstanceOpChild cobj = new InstanceOpChild();
		 // A simple case
		 if (cobj instanceof InstanceOpChild)
		 System.out.println("cobj is instance of Child");
		 else
		 System.out.println("cobj is NOT instance of Child");
		 // instanceof returns true for Parent class also
		 if (cobj instanceof InstanceOpParent)
		 System.out.println("cobj is instance of Parent");
		 else
		 System.out.println("cobj is NOT instance of Parent");

	}

}
