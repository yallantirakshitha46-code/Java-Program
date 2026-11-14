package com.java.basics;

//public class ForEachLoopArray {
//
//	public static void main(String[] args) {
//		int [] arr= {1,4,6,8,3};
//		System.out.println("the given values of an array are ");
//		for(int i=0;i<arr.length;i++)
//		{
//			System.out.println("arr["+i+"]="+arr[i]);
//		}
//	}
//
//}




public class ForEachLoopArray {

	public static void main(String[] args) {
		int []arr= {2,4,6,8,10};
		System.out.println("the given values of an array");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr["+i+"]="+arr[i]);
		}
		for(int j:arr)
		{
		System.out.println("j");
		}
}
}