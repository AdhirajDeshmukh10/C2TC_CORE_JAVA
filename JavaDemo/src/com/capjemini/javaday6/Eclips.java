package com.capjemini.javaday6;

class Eclipse extends Thread{
	
	public void run()
	{
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
	}
}
