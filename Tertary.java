package com.java.basics;
import java.util.Scanner;
public class Tertary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a = sc.nextInt();
int b = sc.nextInt();
String option=(a<b)?"a is less then b":(b<a)?"b is less then a":(a==b)?"Both are Equal":"NoStatement";
System.out.println(option);
sc.close();
	}

}
