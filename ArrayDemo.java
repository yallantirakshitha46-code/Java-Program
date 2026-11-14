package com.java.basics;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int []arr=new int[10];
		int i;
		for(i=0;i<arr.length;i++)
		{
			System.out.println("a["+i+"]=");
			arr[i]=sc.nextInt();
		}
		System.out.println("the given values are: ");
		for(int j:arr)
		{
			System.out.println(j);
		}
		sc.close();
	}

}
