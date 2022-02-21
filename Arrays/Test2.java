package com.Arrays;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] s = {"jammu","kashmir","gujarat","goa","telangana"};
		String target ="goa";
		boolean found = false;
		for(String state:s) {
			if(state.equals(target)) {
				found=true;
			}
		}
		if(found) {
			System.out.println("element is found");
		}
		else {
			System.out.println("element not found");
		}

	}

}
