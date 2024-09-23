package com.deloitte.lab1.Ex4;

import java.util.Scanner;
public class Lab1Ex4 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a +ve number: ");
	        int n = sc.nextInt();
	        
	        System.out.println("Prime numbers up to " + n + ":");
	        if (n <= 1) 
	            System.out.println("Zero");  
	        for (int i = 2; i <= n; i++) {
	            if (isPrime(i)) {
	                System.out.print(i + " ");
	            }
	        }

	        sc.close();
	    }

	    public static boolean isPrime(int number) {
	        
	        for (int i = 2; i <= Math.sqrt(number); i++) {
	            if (number % i == 0)
	                return false;
	        }
	        return true;
	    }
	

}
