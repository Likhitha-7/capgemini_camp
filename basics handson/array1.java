package com.practice_two;

public class array1{

	public static int[] createArray() {
		int[] array = new int[100];
		for (int i = 0; i < 100; i++) {
			array[i] = i;
		}
		return array;
	}

	public static void main(String args[]) {
		int[] array = createArray();
		for (int i = 0; i < 100; i++) {
			System.out.println(array[i]);
		}
	}
}
