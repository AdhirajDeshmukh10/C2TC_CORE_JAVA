package com.cap.java;

public class SwitchCaseChar {

	public static void main(String[] args)
	{
		//character type variable Declaration 
		char x = 'F';
		
		//switch case
		switch (x) 
		{
			case 'a' : 
			case 'A' : 
				System.out.println("The value of x is a");
				break;
				
			case 'b':
			case 'B' :
				System.out.println("The value of x is b");
				break;
				
			case 'c':
			case 'C' :	
				System.out.println("The value of x is c");
				break;
				
			default:
		System.out.println("The value of x is other than a,b,c");
				break;
		}


	}

}
