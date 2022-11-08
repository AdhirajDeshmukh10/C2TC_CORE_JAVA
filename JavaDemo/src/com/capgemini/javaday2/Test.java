package com.capgemini.javaday2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test
{
	public static void main(String[] args) throws IOException
	{

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		String name = reader.readLine();
		int x = Integer.parseInt(reader.readLine());
		 double y = Double.parseDouble(reader.readLine());
		 float z = Float.parseFloat(reader.readLine());
		 
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(name);
	}
}