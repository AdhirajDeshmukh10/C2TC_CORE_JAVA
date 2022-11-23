package com.capjemini.javaday8;

public class Generic 
{

	public static void main(String[] args)
	{
		
		
		Datas<Integer,String> obj=new Datas<Integer,String>(10,"Nayna");
		//System.out.println("Key is"+obj.getKey()+" Value is "+obj.getValue());
		
		obj.display(12,"   Sahjb");
		
		
	}

}


