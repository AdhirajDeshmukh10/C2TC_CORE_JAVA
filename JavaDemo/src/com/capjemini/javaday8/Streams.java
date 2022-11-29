package com.capjemini.javaday8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Streams
{

	public static void main(String[] args)
	{

		// List<Integer> list=List.of(2,4,6,434,5768,565,555);
		// System.out.println(list);
		//

		List<Integer> list=new ArrayList<>();

		list.add(1);
		list.add(35);
		list.add(61);
		list.add(17);
		list.add(190);
		list.add(16);
		list.add(352);
		list.add(618);
		list.add(171);
		list.add(1906);


//without Stream API

		List<Integer> listEven=new ArrayList<>();
		for(Integer i:list)
		{
			if(i % 2==0)
			{
				listEven.add(i);
			}
		}
	System.out.println("Original List:"+list);
	System.out.println("Processed List:"+listEven);
	}
}