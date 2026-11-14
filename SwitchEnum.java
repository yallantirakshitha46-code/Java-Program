package com.java.basics;

public class SwitchEnum {

	public static void main(String[] args) {  //passing enum value to the switch case
		// TODO Auto-generated method stub
		enum Days
		{
			MONDAY,
			TUESDAY,
			FRIDAY,
			SUNDAY
		}
		Days d1=Days.SUNDAY;
		switch(d1)
		{
		case MONDAY:
		{
			System.out.println("this is MONDAY");
			break;
		}
		case TUESDAY:
		{
			System.out.println("this is TUESDAY");
			break;
		}
		case FRIDAY:
		{
			System.out.println("this is FRIDAY");
			break;
		}
		case SUNDAY:
		{
			System.out.println("this is SUNDAY");
			break;
		}
		default:
		{
			System.out.println("this is a default");
			break;
		}
		}
	}

}
