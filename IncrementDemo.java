package com.java.basics;
import java.util.Scanner;
public class IncrementDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
System.out.println("enter the value of ch1");
char ch1=sc.next().charAt(0);
char ch2=++ch1;
System.out.println("The value of ch1 after post increment is "+ch1);
System.out.println("The value of ch2 after post increment is "+ch2);
sc.close();
	}

}
