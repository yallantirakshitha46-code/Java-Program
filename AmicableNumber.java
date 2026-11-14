package com.java.basics;

import java.util.Scanner;

public class AmicableNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a first number: ");
		int n1=sc.nextInt();
		System.out.println("enter second number: ");
		int n2=sc.nextInt();
		int sum1=0,sum2=0;
		for(int i=1;i<n1;i++)
		{
			if(n1%i==0)
			{
				sum1=sum1+i;
			}
		}
		for(int i=1;i<n2;i++)
		{
			if(n2%i==0)
			{
				sum2=sum2+i;
			}
		}
		if(sum1==n2 && n1==sum2)
		{
			System.out.println("both are amicable numbers");
		}
		else
		{
			System.out.println("both are not amicable number");
		}
		sc.close();
	}

}
