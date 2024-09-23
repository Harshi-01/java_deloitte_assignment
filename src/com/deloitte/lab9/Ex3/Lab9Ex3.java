package com.deloitte.lab9.Ex3;
import java.util.function.BiFunction;
public class Lab9Ex3 {

    public static void main(String[] args) {
        String username = "admin";
        String password = "password";

        boolean isLoggedIn = authenticate(username, password);
        System.out.println("Authentication successful: " + isLoggedIn); 

        username = "user";
        password = "wrongpassword";
        isLoggedIn = authenticate(username, password);
        System.out.println("Authentication successful: " + isLoggedIn);
    }

	public static boolean authenticate(String username, String password) {
        String validUsername = "admin";
        String validPassword = "password";

        BiFunction<String, String, Boolean> isAuthenticated = (user, pass) -> user.equals(validUsername) && pass.equals(validPassword);
        return isAuthenticated.apply(username, password);
    }

}
