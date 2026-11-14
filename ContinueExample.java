package com.java.basics;

import java.util.Scanner;

//public class ContinueExample {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a number: ");
//		int n=sc.nextInt();
//		int i=0;
//		while(i<=n)
//		{
//			System.out.println("the value of i is"+i);
//			i++;
//			if(i==5)
//			{
//				i++;
//				continue;
//			}
//		}
//		sc.close();
//	}
//
//}
 

public class ContinueExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i!=0)
			{
				continue;
			}
			count++;
		}
		if(count==2)
		{
			System.out.println("it is a prime number");
		}
		else
		{
			System.out.println("it is not a prime number");
		}
		sc.close();
	}
}
			