package com.capjemini.javaday6;

class Eclipse implements Runnable
{
	
	public void run()
	{
	    
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}