package com.java.basics;

import java.util.Scanner;

public class SwitchExample {//passing char value to the switch case

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value:");
		char ch1=sc.next().charAt(0);
		switch(ch1)
		{
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
		{
			System.out.println("this is an vowel");
			break;
		}
		default:
		{
			System.out.println("this is a constant");
			break;
		}
		}
		sc.close();
	}

}
