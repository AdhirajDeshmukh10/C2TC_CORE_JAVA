package com.capjemini.javaday6;

class OneNote extends Thread{
	public void run()
	{
		System.out.println("OneNote Thread name is"+ Thread.currentThread().getName());
	}
}
