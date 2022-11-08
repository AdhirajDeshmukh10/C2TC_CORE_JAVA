package com.capjemini.javaday6;

class Eclipse4 extends Thread{
	
	public void run()
	{
	    
		for (int i = 0; i < 3; i++) {
			System.out.println("Eclipse Thread name is" + Thread.currentThread().getName());
			
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
