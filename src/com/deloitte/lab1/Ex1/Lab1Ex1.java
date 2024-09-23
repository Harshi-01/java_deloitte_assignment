package com.deloitte.lab1.Ex1;

public class Lab1Ex1 {
	
	public static void main(String[] args) {
		
        int num = 45;
        int result = sumOfCubesOfDigits(num);
        System.out.println("The sum of the cubes of the digits " + num + " is: " + result);
    }

    public static int sumOfCubesOfDigits(int number) {
    	
        int sum = 0;
        while (number > 0) {
            int digit = number % 10; 
            sum += Math.pow(digit, 3); 
            number /= 10;
        }

        return sum;
    }

}
