package com.deloitte.lab9.Ex5;
import java.util.function.IntUnaryOperator;
public class Lab9Ex5 {
	
	 public static void main(String[] args) {
	        IntUnaryOperator factorialMethodRef = Lab9Ex5::factorial;

	        int n = 9;
	        int res = factorialMethodRef.applyAsInt(n);

	        System.out.println("Factorial of " + n + " is: " + res);
	    }

	  public static int factorial(int number) {
	        if (number <= 1) {
	            return 1;
	        }
	        return number * factorial(number - 1); 
	    }

	   
}
