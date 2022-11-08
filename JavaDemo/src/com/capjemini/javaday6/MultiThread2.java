package com.capjemini.javaday6;

public class MultiThread2 
{


	public static void main(String[] args)
	{
		Eclipse e=new Eclipse();	
		e.start();
		        
		for (int i = 0; i < 4; i++)
		{
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}
	}

}


