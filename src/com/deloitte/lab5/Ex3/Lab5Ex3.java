package com.deloitte.lab5.Ex3;

import java.util.Scanner;
public class Lab5Ex3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of an employee: ");
		double sal = sc.nextDouble();
		
		try {
			if(sal<3000.0) {
				throw new EmployException();
			}
			else {
				System.out.println("Salary of an employee: "+sal);
			}
		}catch(EmployException e) {
			System.out.println(e.getMessage());
			}
		}
	}

	class EmployException extends Exception{
		public String getMessage() {
			return "Salary of employee is less than 3000";
		}

}
