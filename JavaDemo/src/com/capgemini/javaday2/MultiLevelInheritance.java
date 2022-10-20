package com.capgemini.javaday2;

class Once
{
	void disp1()
	{
		System.out.println("one");
	}
}

class Twice extends Once
{
	void disp2()
	{
		System.out.println("two");
	}
}

class Thrice extends Twice
{
	void disp3()
	{
		System.out.println("three");
	}
}

class Fourth extends Thrice
{
	void disp4()
	{
		System.out.println("four");
	}
	
}


public class MultiLevelInheritance
{

	public static void main(String[] args)
	{
		Fourth obj1 = new Fourth ();
		obj1.disp1();
		obj1.disp2();
		obj1.disp3();
		obj1.disp4();
		
	}

}
