package com.Qspiders.App1.StringObjectToPrimitive;

public class StringObjectToPrimitive 
{
	public static void main(String[] args) 
	{
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		
		int sum=x+y;
		System.out.println("Sum of two numbers is "+sum);
	}
}
