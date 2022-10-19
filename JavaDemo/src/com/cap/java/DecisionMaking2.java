package com.cap.java;

public class DecisionMaking2 
{

	public static void main(String[] args)
	{
		
		//first 
		
		//variable declaration
		int x = 10; int y = 11;
		  
		//condition to check if x is less than or equal to y 
		  if(!(x < y) || (x == y))
		  { 
			  System.out.println(" X is greater than and Equal to y");
		  }
		  
		  else
		  { 
			  System.out.println("x is not greater than or equal to y"); 
		  }
		 

		
		//second 
		  
		//variable declaration
		int ageOfBoy = 36;
		int ageOfGirl = 25;
		
		//condition to check age of boy
		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) 
		{
			System.out.println("the boy is ready to get married!"+ "");
		}
		
		else 
		{
			System.out.println("Wait for it kiddo!");
		}


	}


}


