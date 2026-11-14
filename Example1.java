package com.java.basics;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the no.of elements: ");
		int n=sc.nextInt();
		int[]arr=new int[n];
		System.out.println("enter the numbers: ");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("enter the value to search: ");
		int value=sc.nextInt();
		boolean found=false;
		for(int i=0;i<n;i++)
		{
			if(arr[i]==value)
			{
				System.out.println("the value of position is found"+i);
				found=true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("the value of position is not found");
		}
		sc.close();
	}

}
