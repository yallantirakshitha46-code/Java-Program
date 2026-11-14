package com.java.basics;

import java.util.Scanner;

public class PatterSeriesReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int n=sc.nextInt();
		for(int i=6;i>=1;i--)
		{
			if(i%2==0)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+" ");
				}
			}
			else
			{
				for(int j=i;j>=1;j--)
				{
					System.out.print(j+" ");
				}
			}
			System.out.println();
		}
		sc.close();
	}

}
