package com.capgemini.javaday2;

public class TkClass3
{

	void function1(TkClass3 obj)
	 {
		System.out.println("Function 1 invoked");
	 }
	 void function2()
	 {
		 function1(this);
	 }

	}


