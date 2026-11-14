package com.java.basics;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number: ");
		int num=sc.nextInt();
		 int sum=0;
		int strong=num;
		for( ;num!=0; )
		{
			int temp=num%10;
			int fact=1;
			for(int i=1;i<=temp;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			num=num/10;
		}
		if(strong==sum)
		{
			System.out.println("it is a strong number");
		}
		else
		{
			System.out.println("it is not a strong number");
		}
		sc.close();
	}

}
