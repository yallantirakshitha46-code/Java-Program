package com.java.basics;

import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {//passing integer value to the switch case
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		int num=sc.nextInt();
		switch(num)
		{
		case 10:
		{
			System.out.println("this is case 10");
			break;
		}
		case 15:
		{
			System.out.println("this is case 15");
			break;
		}
		case 20:
		{
			System.out.println("this is case 20");
			break;
		}
		default:
		{
			System.out.println("this is default case");
			break;
		}
		}
		sc.close();
	}
}
