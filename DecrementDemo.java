package com.java.basics;

import java.util.Scanner;

public class DecrementDemo {

	public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
    System.out.println("enter the value of a");
    int a=sc.nextInt();
    System.out.println("enter the value of b");
    int b=sc.nextInt();
    int c;
    c=--a + --b;
    System.out.println("value of a after post decrement:"+a);
    System.out.println("value of b after post decrement:"+b);
    System.out.println("value of c after post decrement:"+c);
    sc.close();
	}

}
