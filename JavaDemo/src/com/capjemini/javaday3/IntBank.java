package com.capjemini.javaday3;

interface Bank
{
 float rateOfInterest();
}
interface RBIBank
{
float RBIroi();
}
interface WorldBank
{
float Worldroi();
}

class IntBank implements Bank, RBIBank, WorldBank
{
	@Override
	public float rateOfInterest()
	{
		return 9.15f;
	}
	@Override
	public float RBIroi()
	{
		return 8.7f;
	}
	@Override
	public float Worldroi()
	{
		return 6.7f;
	}
}


