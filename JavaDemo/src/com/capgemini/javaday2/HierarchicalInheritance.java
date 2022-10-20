package com.capgemini.javaday2;
class one
{
	void disp1()
	{
		System.out.println("One");
	}
}

class two extends one
{
	void disp2()
	{
		System.out.println("two");
	}
}

class three extends one
{
	void disp3()
	{
		System.out.println("three");
	}
}

class four extends one
{
	void disp4()
	{
		System.out.println("four");
	}

	
}

public class HierarchicalInheritance
{

	public static void main(String[] args)
	{
		four obj1 = new four();
		obj1.disp1();
		obj1.disp4();
		
		three obj2 = new three();
		obj2.disp1();
		obj2.disp3();
		
		two obj3 = new two();
		obj3.disp1();
		obj3.disp2();

	}

}
