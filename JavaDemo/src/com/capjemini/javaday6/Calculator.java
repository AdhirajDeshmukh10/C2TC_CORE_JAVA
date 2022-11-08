package com.capjemini.javaday6;

class calculator extends Thread
{
	public void run()
	{
		System.out.println("calculator Thread name is"+ Thread.currentThread().getName());
	}

}
