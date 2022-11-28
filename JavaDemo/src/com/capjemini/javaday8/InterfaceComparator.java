package com.capjemini.javaday8;

import java.util.ArrayList;
import java.util.Collections;

import java.util.List;


	class Info
	{
		private String name;

		public Info(String name)
		{
			this.name = name;
		}

		public String getName() 
		{
			return name;
		}

		@Override
		public String toString() 
		{
			return "Data [name=" + name + "]";
		}
		
	}

	public class InterfaceComparator 
	{

		public static void main(String[] args)
		{
			List<Info> list=new ArrayList<>();
			
			list.add(new Info("Adhiraj"));
			list.add(new Info("Aniket"));
			list.add(new Info("Parimal"));
			list.add(new Info("Prajwal"));
			list.add(new Info("Bilal"));
			list.add(new Info("Nikhil"));

					
			
			Collections.sort(list,(Info o1,Info o2)->{return o1.getName().compareTo(o2.getName());});
			
			for (Info Info:list)
			{
				System.out.println(Info.getName());
			}
		}
	}
