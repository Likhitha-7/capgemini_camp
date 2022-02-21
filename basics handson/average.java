package com.practice_two;
public class average {
	public void avg(double[] arr, double total) {

		for (int i = 0; i < arr.length; i++) {
			total = total + arr[i];
		}

		double average = total / arr.length;

		System.out.format("The average is: %.3f", average);
	}

	public static void main(String[] args) {
		double[] arr = {2.5, 11.4, 22.6, 5, 7.4 };
		double total = 0;
		average avg = new average();
		avg.avg(arr, total);
	}
}
