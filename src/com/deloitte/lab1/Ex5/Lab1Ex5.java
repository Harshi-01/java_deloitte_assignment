package com.deloitte.lab1.Ex5;

public class Lab1Ex5 {
    public static void main(String[] args) {
        
        int n = 5;
        int result =calculateSum(n);
        System.out.println("The sum of the first " + n + " natural numbers divisible by 3 or 5 is: " + result);
    }
    
    public static int calculateSum(int n) {
        int sum = 0;
        int count = 0;
        int number = 1;

        while (count < n) {
            if (number % 3 == 0 || number % 5 == 0) {
                sum += number;
                count++; 
            }
            number++; 
        }

        return sum; 
    }

}
