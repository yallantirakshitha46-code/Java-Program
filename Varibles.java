package com.java.basics;

public class Varibles {
String name;
int age;
String collage;
static String course;
void display()
{
	String message ="Student details";
	System.out.println(message);
	System.out.println("name:"+name);
	System.out.println("age:"+age);
	System.out.println("collage:"+collage);
	System.out.println("course:"+course);
}

	public static void main(String[] args) {
		Varibles v1=new Varibles();
		v1.name="rakshitha";
		v1.age=20;
		v1.collage="VITS";
		v1.course="cse";
		v1.display();
	}

}
