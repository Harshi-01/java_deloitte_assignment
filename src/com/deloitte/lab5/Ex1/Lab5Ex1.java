package com.deloitte.lab5.Ex1;

import java.util.Scanner;

public class Lab5Ex1 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age of person: ");
		int age = sc.nextInt();
		
		try {
			if(age<15) {
				throw new AgeLT15("Your age is less than 15");
			}
			else {
				System.out.println("Your age is greater than or equal to 15");
			}
		}catch(AgeLT15 e) {
			e.getMessage();
			}
		}
	}

	class AgeLT15 extends Exception{
		public AgeLT15(String str) {
			System.out.println(str);
		}

}
