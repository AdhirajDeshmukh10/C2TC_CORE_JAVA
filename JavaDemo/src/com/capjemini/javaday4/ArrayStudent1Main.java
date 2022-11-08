package com.capjemini.javaday4;

public class ArrayStudent1Main {

	public static void main(String[] args)
	{
		// declares an Array of integers.
		ArrayStudent1[] arr;
		 // allocating memory for 5 objects of type Student.
		 arr = new ArrayStudent1[5];
		 // initialize the first elements of the array
		 arr[0] = new ArrayStudent1(1,"aman");
		 // initialize the second elements of the array
		 arr[1] = new ArrayStudent1(2,"vaibhav");
		 // so on...
		 arr[2] = new ArrayStudent1(3,"shikar");
		 arr[3] = new ArrayStudent1(4,"dharmesh");
		 arr[4] = new ArrayStudent1(5,"mohit");
		 // accessing the elements of the specified array
		 for (int i = 0; i < arr.length; i++)
		 System.out.println("Element at " + i + " : " +
		 arr[i].roll_no +" "+ arr[i].name);

	}

}
