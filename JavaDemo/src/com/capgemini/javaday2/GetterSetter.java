package com.capgemini.javaday2;



class Car
	{
		private String doors;
		private String engine;
		private String driver;
		private int speed;
		
		public void setSpeed(int speed)
		{
			this.speed = speed;
		}
		
		public int getSpeed()
		{
			return speed;
		}
	}	
		public class GetterSetter
		{
			public static void main(String[] args) 
			{	
				Car car=new Car();
				car.setSpeed(10);
				System.out.println("Speed of Car = "+car.getSpeed());
				
			}
		}
		
		
	

