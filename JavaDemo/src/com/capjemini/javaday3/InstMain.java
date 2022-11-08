package com.capjemini.javaday3;

public class InstMain
{

		{
			 Bank b = new IntBank();
			 System.out.println("ROI: " + b.rateOfInterest());
			 System.out.println("ROI: " + ((WorldBank) b).Worldroi());
			 System.out.println("ROI: " + ((RBIBank) b).RBIroi());
		 }

}
