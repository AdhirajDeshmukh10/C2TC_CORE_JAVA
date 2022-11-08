package com.capgemini.javaday2;

import java.util.Scanner;
public class InputDemo
{
	public static void main(String[] args)
	{

		System.out.println("Enter a number");
		Scanner scr = new Scanner(System.in);
		int x;
		x = scr.nextInt();
		// x = scr.nextDouble();
		System.out.println("the string you entered is: "+x);
	}

}
