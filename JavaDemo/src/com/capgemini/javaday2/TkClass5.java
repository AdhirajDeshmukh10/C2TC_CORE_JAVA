package com.capgemini.javaday2;

public class TkClass5 {

	int rollno;
	String name,course;
	float fee;
	TkClass5(int rollno,String name,String course)
	{
	this.rollno=rollno;
	this.name=name;
	this.course=course;
	}
	TkClass5(int rollno,String name,String course,float fee)
	{
	this(rollno,name,course);//reusing constructor
	this.fee=fee;
	}
	void display()
	{
	System.out.println(rollno+" "+name+" "+course+" "+fee);
	} 

}
