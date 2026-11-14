package com.java.basics;

public class Variable {
	byte semester=2;
	short rollnumber=5308;
	int age=20;
	long number=987654321;
	float height=5.3f;
	double fees=25.000;
	char grade='A';
	boolean pass=true;
    static String collegename="PBR VITS";
    void display()
    {
    	String message="Student Details";
    	System.out.println(message);
    	System.out.println("semester:"+semester);
    	System.out.println("rollnumber:"+rollnumber);
        System.out.println("age:"+age);
    	System.out.println("number:"+number);
    	System.out.println("height:"+height);
    	System.out.println("fees:"+fees);
    	System.out.println("grade:"+grade);
    	System.out.println("pass:"+pass);
        System.out.println("collegename:"+collegename);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Variable v1=new Variable();
		v1.display();
		
	}

}
