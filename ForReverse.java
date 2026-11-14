package com.java.basics;

import java.util.Scanner;

public class ForReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number:");
		int n=sc.nextInt();
		int rev=0,temp;
		for(;n!=0;)
		{
			temp=n%10;
			rev=rev*10 + temp;
			n=n/10;
		}
		System.out.println("reverse of a given number is "+rev);
		sc.close();
	}

}
