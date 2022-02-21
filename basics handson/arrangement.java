package com.practice_two;
import java.util.Scanner;

public class arrangement {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the starting number");
		int a=sc.nextInt();
//		System.out.println("enter the ending number");
		int b=sc.nextInt();

		arrangement obj = new arrangement();
		obj.printdescending(a,b);
	}

	
	 public static void printdescending(int a,int b) {
		 
		 for(int i=(b-1);i>a;i--) {
			 System.out.println(i);
		 }
	 }
}

