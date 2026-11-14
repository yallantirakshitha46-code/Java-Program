package com.java.basics;
import java.util.Scanner;
public class TertaryExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
int c=sc.nextInt();
String option=(a>b && a>c)?"a is greater then b and c":(b>a && b>c)?"b is greater then a and c":(c>a && c>b)?"c is greater then a and b":(a==b && b==c && c==a)?"a b and c are Equal":"NoStatement";
System.out.println(option);
sc.close();
}
}
