package com.capjemini.javaday6;

class Eclipse2 extends Thread{
	
	public void run()
	{
	    for (int i = 0; i < 4; i++) {
		System.out.println("Eclipse Thread name is"+ Thread.currentThread().getName());
		System.out.println("Eclipse Thread ID is" + Thread.currentThread().getId());
	}
}
}

