package com.deloitte.lab1.Ex6;

public class Lab1Ex6 {

    public static void main(String[] args) {
       
        int n = 10;
        int result = calculateDifference(n);
        System.out.println("The difference for the first " + n + " natural numbers is: " + result);
    }
    
        public static int calculateDifference(int n) {
            int sumOfSquares = 0;
            int sum = 0;
            for (int i = 1; i <= n; i++) {
                sumOfSquares += i * i; // Sum of squares
                sum += i; // Sum of natural numbers
            }
            int squareOfSum = sum * sum;

            return squareOfSum - sumOfSquares;
        
    }

}
