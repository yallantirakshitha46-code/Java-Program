package com.java.basics;

import java.util.Scanner;


//if else concept*******************************************


//public class PracticeProblem {
//
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the age: ");
//		int age=sc.nextInt();
//		System.out.println("enter the salary: ");
//		int sal=sc.nextInt();
//		if(age>=21 && sal>=25000)
//		{
//			System.out.println("eligible for the loan");
//		}
//		else
//		{
//			System.out.println("not eligible for the loan");
//		}
//		sc.close();
//	}
//
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the age: ");
//		int age=sc.nextInt();
//		if(age>=18)
//		{
//			System.out.println("eligible for the movie");
//		}
//		else
//		{
//			System.out.println("not eligible for the movie");
//		}
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter electricity bill: ");
//		int bill=sc.nextInt();
//		if(bill>5000)
//		{
//			float discount=(10.0f/100*bill);
//			float result=bill-discount;
//			System.out.println("providing discount: "+discount);
//			System.out.println("result: "+result);
//		}
//		else
//		{
//			System.out.println("not providing discount");
//		}
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter mobile recharge: ");
//
//		int recharge=sc.nextInt();
//		if(recharge>299)
//		{
//			System.out.println("provide 2gb data extra");
//		}
//		else 
//		{
//			System.out.println("not provide the data");
//		}
//		sc.close();
//	}
//}

//nested if concept*****************************************************


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the marks: ");
//		int marks=sc.nextInt();
//		System.out.println("enter entrance marks");
//		int entrancemarks=sc.nextInt();
//		if(marks>=60)
//		{
//			if(entrancemarks<=1000)
//			{
//				System.out.println("admission is granted");
//			}
//			else
//			{
//			System.out.println("application is rejected");
//			}
//		}
//			else
//			{
//				System.out.println("application is rejected");
//			}
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the amount: ");
//		int amount=sc.nextInt();
//		System.out.println("enter the premium: ");
//		boolean premium=sc.nextBoolean();
//		if(amount>=500)
//		{
//			if(premium)
//			{
//				System.out.println("free delivery");
//			}
//			else
//			{
//				System.out.println("delivery charge is 50");
//			}
//		}
//		else
//		{
//			System.out.println("delivery charge is 50");
//		}
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the salary: ");
//		int amount=sc.nextInt();
//		System.out.println("enter the credit score: ");
//		int credit=sc.nextInt();
//		System.out.println("enter the age: ");
//		int age=sc.nextInt();
//		if(amount>=40000 && credit>=750 && age>=21)
//		{
//			System.out.println("approved a credit card");
//		}
//		else
//		{
//			System.out.println("not approved for a credit card");
//		}
//		sc.close();
//	}
//}

//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a year: ");
//		int n1=sc.nextInt();
//		System.out.println("enter the rating: ");
//		float f1=sc.nextFloat();
//		if(n1>=5)
//		{
//			if(f1>=4.5f)
//			{
//				System.out.println("an employee gets promoted");
//			}
//			else
//			{
//				System.out.println("not eligible for the promotion");
//			}
//		}
//		else
//		{
//			System.out.println("not eligible for the promotion");
//		}
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter a marks: ");
//		int marks=sc.nextInt();
//		System.out.println("enter family income: ");
//		double income=sc.nextDouble();
//		if(marks>=90 && income<300000)
//		{
//			System.out.println("student is eligible");
//		}
//		else
//		{
//			System.out.println("student is not eligible");
//		}
//		sc.close();
//	}
//}



//loops concept***********************************************
//
//
//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int sum=0;
//		for(int i=1;i<=7;i++)
//		{
//			System.out.println("enter the amount withdraw in a day"+i+":");
//			int amount=sc.nextInt();
//			sum=sum+amount;
//		}
//		System.out.println("total amount withdraw= "+sum);
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the no.of product: ");
//		int n=sc.nextInt();
//		int sum=0;
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println("enter the price of the product"+i+":");
//			int price=sc.nextInt();
//			sum=sum+price;
//
//		}
//		System.out.println("total price: "+sum);
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no of students: ");
//		int student=sc.nextInt();
//		int present=0;
//		int absent=0;
//		for(int i=1;i<=student;i++)
//		{
//			System.out.println("enter attendance of students:"+ i);
//			int attendance=sc.nextInt();
//		if(attendance == 1)
//		{
//			present++;
//		}
//		else
//		{
//			absent++;
//		}
//		}
//		System.out.println("total no.of present: "+present);
//		System.out.println("total no.of absent: "+absent);
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no.of employees: ");
//		int n=sc.nextInt();
//		double highest=0;
//		double lowest=0;
//		for(int i=1;i<=n;i++)
//		{
//			System.out.println("enter salary of employee: "+i);
//			double salary=sc.nextDouble();
//			if(i==1)
//			{
//				highest=salary;
//				lowest=salary;
//			}
//			else
//			{
//				highest=Math.max(highest, salary);
//				lowest=Math.min(lowest, salary);
//			}
//		}
//		System.out.println("highest salary: "+highest);
//		System.out.println("lowest salary: "+lowest);
//		sc.close();
//	}
//}


//**********************Arrays concept***********************************


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no.of student: ");
//		int n=sc.nextInt();
//		int[] marks=new int[n];
//		System.out.println("enter the marks: ");
//		for(int i=0;i<n;i++)
//		{
//			marks[i]=sc.nextInt();
//		}
//		int sum=0;
//		int max=marks[0];
//		int min=marks[0];
//		for(int i=0;i<n;i++)
//		{
//			sum+=marks[i];
//			if(marks[i]>max)
//			{
//				max=marks[i];
//			}
//			if(marks[i]<min)
//			{
//				min=marks[i];
//			}
//		}
//		double avg=(double)sum/n;
//		System.out.println("total marks: "+sum);
//		System.out.println("average marks: "+avg);
//		System.out.println("highest marks: "+max);
//		System.out.println("lowest marks: "+min);
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no.of employees: ");
//		int n=sc.nextInt();
//		int[] salary=new int[n];
//		System.out.println("enter the salary: ");
//		for(int i=0;i<n;i++)
//		{
//			salary[i]=sc.nextInt();
//		}
//		int highest=salary[0];
//		int lowest=salary[0];
//		int count=0;
//		for(int i=0;i<n;i++)
//		{
//			if(salary[i]>highest)
//			{
//				highest=salary[i];
//			}
//			if(salary[i]<lowest)
//			{
//				lowest=salary[i];
//			}
//			if(salary[i]>50000)
//			{
//				count++;
//			}
//		}
//		System.out.println("highest count: "+highest);
//		System.out.println("lowest count: "+lowest);
//		System.out.println("employee earning more than 50000: "+count);
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter no.of Student: ");
//		int n=sc.nextInt();
//		int[] attendence=new int[n];
//		System.out.println("enter the attendence: ");
//		for(int i=0;i<n;i++)
//		{
//			attendence[i]=sc.nextInt();
//		}
//		int present=0;
//		int absent=0;
//		for(int i=0;i<n;i++)
//		{
//			if(attendence[i]==1)
//			{
//				present++;
//			}
//			else
//			{
//				absent++;
//			}
//		}
//		int percentage=(present*100)/n;
//		System.out.println("present student: "+present);
//		System.out.println("absent student: "+absent);
//		System.out.println("attendence percentage: "+percentage);
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		int[] temp=new int[7];
//		for(int i=0;i<7;i++)
//		{
//			temp[i]=sc.nextInt();
//		}
//		int highest=temp[0];
//		int lowest=temp[0];
//		int sum=0;
//		int above35=0;
//		int highestday=0;
//		for(int i=0;i<7;i++)
//		{
//			sum=sum+temp[i];
//			if(temp[i]>highest)
//			{
//				highest=temp[i];
//				highestday=i;
//			}
//			if(temp[i]<lowest)
//			{
//				lowest=temp[i];
//			}
//			if(temp[i]>35)
//			{
//				above35++;
//			}
//		}
//		int average=sum/7;
//		System.out.println("highest temperature: "+highest);
//		System.out.println("lowest temperature: "+lowest);
//		System.out.println("average temperature: "+average);
//		System.out.println("days above 35: "+above35);
//		System.out.println("highest temperature was the day: "+(highestday+1));
//		sc.close();
//	}
//}


//public class PracticeProblem
//{                                                    
//	public static void main(String[] args)
//	{
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter employees id:");
//		int[] ids=new int[5];
//		for(int i=0;i<ids.length;i++)
//			ids[i]=sc.nextInt();
//		System.out.println("enter the search id");
//		int search=sc.nextInt();
//		boolean found=false;
//		for(int id : ids)
//		{
//			if(id==search)
//			{
//				found =true;
//				break;
//			}
//		}
//		if(found)
//		{
//			System.out.println("employee found");
//		}
//		else
//		{
//			System.out.println("employee not found");
//		}
//		sc.close();
//	}
//}


public class PracticeProblem
{                                                    
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		sc.close();
	}
}