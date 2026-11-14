package com.java.basics;

import java.util.Scanner;

public class SwitchString {

	public static void main(String[] args) {   //passing string value to the switch case
		// TODO Auto-generated method stub
		System.out.println("enter the name:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		switch(str)
		{
		case "Rakshi":
		{
			System.out.println("this is Rakshi");
			break;
		}
		case "Srinu":
		{
			System.out.println("this is Srinu");
			break;
		}
		case "Chinnu":
		{
			System.out.println("this is chinnu");
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
