package com.deloitte.lab3.Ex8;

import java.util.Scanner;

public class Lab3Ex8 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string: ");
		String str = sc.next();
		
		if(checkString(str)) {
			System.out.println("String is positive");
		}
		else {
			System.out.println("String is not positive");
		}
	}
	
	public static boolean checkString(String str) {
		
		boolean n = false;
		for(int i=0;i<str.length()-1;i++) {
			if((int)str.charAt(i) < (int)str.charAt(i+1)) {
				n = true;
			}
			else {
				n = false;
				break;
			}
		}
		
		return n;
	}

}
