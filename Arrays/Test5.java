package com.Arrays;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int prism[][]= {{1,2,3},{4,5,6}};
		int mdits[][]= {{7,8,9},{10,11,12}};
		int pmd[][] = new int[2][3];
		for(int i=0;i<2;i++) {
			for(int j=0;j<3;j++) {
				pmd[i][j]=prism[i][j]+mdits[i][j];
				System.out.print(prism[i][j]+" ");
				
			}
			System.out.println();
		}

	}

}
