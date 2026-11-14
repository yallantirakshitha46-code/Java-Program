package com.java.basics;
import java.util.Scanner;
public class Esalary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int eno;
		float esal,da,ta,pf,gross,net;
		System.out.println("enter employee no: ");
		eno=sc.nextInt();
		System.out.println("enter employee salary: ");
		esal=sc.nextInt();
		if (esal>70000)
		{
			da=esal * 10.0f / 100;
			ta=esal * 12.0f / 100;
			pf=esal * 14.0f / 100;
		}
		else if(50000<=70000) 
		{
			da=esal * 12.0f / 100;
			ta=esal * 10.0f / 100;
			pf=esal * 6.0f / 100;
		}
		else if(30000<=50000)
		{
			da=esal * 8.0f / 100;
			ta=esal * 7.0f / 100;
			pf=esal * 4.0f / 100;
		}
		else 
		{
			da=esal * 6.0f / 100;
			ta=esal * 4.0f / 100;
			pf=esal * 3.0f / 100;
		}
		gross=esal + da + ta;
		net=gross - pf;
		System.out.println("employee no:"+eno);
		System.out.println("employee salary:"+esal);
		System.out.println("da:"+da);
		System.out.println("ta:"+ta);
		System.out.println("pf:"+pf);
		System.out.println("gross:"+gross);
		System.out.println("net:"+net);
		sc.close();
	}

}
