package com.capgemini.javaday2;

import java.util.Scanner;
public class InputDemo2
{
 public static void main(String[] args)
{

 System.out.println("Enter a String");
 Scanner scr = new Scanner(System.in);
 String str = scr.nextLine();
 System.out.println("the string you entered is: "+str);
 }

}