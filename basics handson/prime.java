package com.practice_two;
import java.util.Scanner;

public class prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first number");
		int a=sc.nextInt();
		System.out.println("enter the second number");
		int b=sc.nextInt();
		prime obj=new prime();
		for(int i=a;i<b;i++) {
			obj.getprime(i);
		}
	}
	public static void getprime(int k) {
		int initialize = 0;
		for(int i = 2; i < (k/2+1); i++) {
			if(k% i == 0){
				initialize ++;
				break;
			}
	    }

	    	if (initialize== 0){
	    		System.out.print(k + " ");
	    	}
	}
}
