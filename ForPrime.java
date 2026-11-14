package com.java.basics;

import java.util.Scanner;

public class ForPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the starting range:");
		int start=sc.nextInt();
		System.out.println("enter the ending range");
		int end=sc.nextInt();
		for(;start<=end;)
		{
			int count=0;
			for(int i=1;i<=start;i++)
			{
				if(start%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println("prime number "+start);
			}
			start++;
		}
		sc.close();
		
	}

}
