package com.java.basics;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int armstrong=n;
		int sum=0;
		while(n>0)
		{
			int temp=n%10;
			sum=sum+temp*temp*temp*temp;
			n=n/10;
		}
		if(armstrong==sum)
		{
			System.out.println("it is a armstrong number");
		}
		else
		{
			System.out.println("it is not a armstrong number");
		}
		sc.close();
	}

}
