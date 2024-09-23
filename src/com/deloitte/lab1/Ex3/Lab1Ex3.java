package com.deloitte.lab1.Ex3;

import java.util.Scanner;

public class Lab1Ex3 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter a number ");
	        int n = sc.nextInt();
	       
	        int nonrR = fibonacciNonRecursive(n);
	        System.out.println("The " + n + "th Fibonacci number (non-recursive) is: " + nonrR);
	        int rR = fibonacciRecursive(n);
	        System.out.println("The " + n + "th Fibonacci number (recursive) is: " + rR);
	        
	        sc.close();
	    }

	    // Non-recursive method 
	    public static int fibonacciNonRecursive(int n) {
	        if (n <= 0) 
	        	return 0; 
	        if (n == 1 || n == 2) 
	        	return 1; 

	        int a = 1, b = 1, c = 0;
	        for (int i = 3; i <= n; i++) {
	            c = a + b; 
	            a = b; 
	            b = c; 
	        }
	        return c;
	        
	    }

	    // Recursive method 
	    public static int fibonacciRecursive(int n) {
	        if (n <= 0) 
	        	return 0; 
	        if (n == 1 || n == 2) 
	        	return 1; 
	        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
	    }

}
