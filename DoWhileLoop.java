package com.java.basics;

import java.util.Scanner;

public class DoWhileLoop {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int i=0;
		do
		{
			System.out.println("the value of i is "+i);
			i++;
		}
		while(i>=n);
		sc.close();
	}

}
