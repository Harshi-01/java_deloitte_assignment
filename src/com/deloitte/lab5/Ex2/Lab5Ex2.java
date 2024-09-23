package com.deloitte.lab5.Ex2;
import java.util.Scanner;

public class Lab5Ex2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name: ");
		String firstName = sc.nextLine();
		
		System.out.println("Enter middle name: ");
		String MiddleName = sc.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = sc.nextLine();
		
		try {
			if(firstName.equals("") || lastName.equals("")) {
				throw new FNE("First and Last name can not be blank");
			}
			else {
				System.out.println("Full name: "+firstName+" "+MiddleName+" "+lastName);
			}
		}catch(FNE e) {
			e.getMessage();
			}
		}
	}

	class FNE extends Exception{
		public FNE(String str) {
			System.out.println(str);
		}

}
