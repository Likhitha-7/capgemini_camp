package com.practice_two;
import java.util.Scanner;

public class rules {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a age");
		int age = sc.nextInt();
		System.out.println("enter the state");
		String state = sc.next();

//		int age = 55;
//		String state = "TN";
		rules obj = new rules();
		boolean m = obj.findlicenseeligibility(age, state);
		System.out.println(m);

	}

	public static boolean findlicenseeligibility(int age, String state) {
		boolean a = true;
		if ((age > 18 && age < 60) && (state == "TN" || state == "KA" || state == "KL")) {

			a = true;

		} else if ((age > 60 || age < 18) && (state == "TN" || state == "KA" || state == "KL")) {

			a = false;
		} else {
			if (age > 15) {
				a = true;

			} else {
				a = false;
			}
		}
		return a;

	}

}
