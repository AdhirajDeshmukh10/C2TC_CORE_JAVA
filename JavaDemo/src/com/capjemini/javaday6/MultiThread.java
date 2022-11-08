package com.capjemini.javaday6;

public class MultiThread {

	
	public static void main(String[] args) {
		Eclipse e=new Eclipse();	
	    e.start();
	    
	    calculator c=new calculator();	
	    c.start();
	
	    Chrome ch=new Chrome();	
	    ch.start();
	    
	    OneNote on=new OneNote();	
	    on.start();
	}

}
