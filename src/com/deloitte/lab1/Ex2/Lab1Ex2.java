package com.deloitte.lab1.Ex2;

import java.util.Scanner;

public class Lab1Ex2 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.println("Select yourr choice:");
	        System.out.println("1: Red");
	        System.out.println("2: Yellow");
	        System.out.println("3: Green");
	        

	        int choice = sc.nextInt();

	        switch (choice) {
	            case 1:
	                System.out.println("Stop");
	                break;
	            case 2:
	                System.out.println("Ready");
	                break;
	            case 3:
	                System.out.println("Go");
	                break;
	            default:
	                System.out.println("Invalid choice! Please select one of the above");
	                break;
	        }

	        sc.close();
	    }

}
