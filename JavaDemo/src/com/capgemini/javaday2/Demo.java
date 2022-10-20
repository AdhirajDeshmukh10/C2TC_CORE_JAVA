package com.capgemini.javaday2;

public class Demo {
	private String doors;
	private int speed;
	
	public int getSpeed() 
	{
		return speed;
	}
	public void setSpeed(int speed) 
	{
		this.speed = speed;
	}
	
	public String getDoors()
	{
		return doors;
	}
	public void setDoors(String doors) 
	{
		this.doors = doors;
	}
	
	public String run()
	{
		if(doors.equals("closed")&& speed>0)
		{
			return "return";
			
		}
		else
			return "not running";
	}
}
