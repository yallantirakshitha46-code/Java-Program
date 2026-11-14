package com.java.basics;

public class SwitchExpression {

	public static void main(String[] args) {   //using switch expression in java 17 when the break statement is deleted in switch case//
		// TODO Auto-generated method stub
		int choice=3;
		String str=switch(choice)
				{
		case 1->
		"case one";
		case 2->
		"case two";
		case 3->
		"case three";
		case 4->
		"case four";
		case 5->
		"case five";
		default->
		"default case";
				};
				System.out.println(str);
	}

}
