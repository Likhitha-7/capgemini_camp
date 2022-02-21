package com.Arrays;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prism = new int[5];
		prism[0] = 21;
		prism[1] = 43;
		prism[2] = 56;
		prism[3] = 89;
		prism[4] = 45;
		for(int element:prism) {
			System.out.println(element);
			
		}
		System.out.println("*******************************************");
		for(int i=0;i<prism.length;i++) {
			System.out.println(prism[i]);
		}
	}

}
