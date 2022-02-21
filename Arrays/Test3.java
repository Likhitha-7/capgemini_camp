package com.Arrays;

import java.util.Arrays;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prism = new int[5];
		prism[0] = 21;
		prism[1] = 43;
		prism[2] = 56;
		prism[3] = 89;
		prism[4] = 45;
		System.out.println(prism);
		int[] focus = {32,54,65,76,89,4};
		int ind_pos=9;
		int value = 7;
		System.out.println(Arrays.toString(focus));
		for(int i=focus.length-1;i>ind_pos;i--) {
			focus[ind_pos]=value;
		}
		

	}

}
