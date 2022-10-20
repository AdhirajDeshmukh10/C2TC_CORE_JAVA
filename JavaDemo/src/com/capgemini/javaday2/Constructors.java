package com.capgemini.javaday2;

public class Constructors
{
	private String doors;
	private int speed;
	
	public Constructors()
	{
		doors="opened";
		speed=0;
	}
	public Constructors(String doors, int speed)
	{

		this.doors = doors;
		this.speed = speed;
	}

	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public String getDoors() {
		return doors;
	}
	public void setDoors(String doors) {
		this.doors = doors;
	}
	
	public String run()
	{
		if(doors.equals("closed")&& speed>10)
		{
			return "return";
			
		}
		else
			return "not running";
	}

}
