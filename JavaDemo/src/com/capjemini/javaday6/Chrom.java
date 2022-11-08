package com.capjemini.javaday6;

class Chrome extends Thread{
	public void run()
	{
		System.out.println("Chrome Thread name is"+ Thread.currentThread().getName());
	}
}
