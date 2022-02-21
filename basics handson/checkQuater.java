package com.practice_two;
import java.util.Scanner;

public class checkQuater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the month");
		int n = sc.nextInt();

		checkQuater obj = new checkQuater();
		obj.checkquarter(n);
	}

	public static void checkquarter(int n) {

		if (n == 1 || n == 2 || n == 3) {

			System.out.println("Quarter 1");
		} else if (n == 4 || n == 5 || n == 6) {

			System.out.println("Quarter 2");
		}

		else if (n == 7 || n == 8 || n == 9) {

			System.out.println("Quarter 3");
		}

		else if (n == 10 || n == 11 || n == 12) {

			System.out.println("Quarter 4");
		} else {
			System.out.println("invalid input");
		}

	}

}



	
