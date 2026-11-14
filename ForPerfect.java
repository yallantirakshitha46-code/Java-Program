package com.java.basics;

import java.util.Scanner;

public class ForPerfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");   //1+14+2+4+7
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(n==sum)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
		}
		sc.close();
	}

}
