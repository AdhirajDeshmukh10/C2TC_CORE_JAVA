package com.capjemini.javaday6;

public class Multithread3
{

		public static void main(String[] args)
		{
			Eclipse e=new Eclipse();
			Thread t=new Thread(e);
			t.start();
		        
			System.out.println("Main Thread name is" + Thread.currentThread().getName());
			System.out.println("Main Thread ID is" + Thread.currentThread().getId());

		}
		


}


