package com.deloitte.lab6.Ex4;


import java.util.HashMap;
import java.util.Map;

public class Lab6Ex4 {
	

    public static void main(String[] args) {
        HashMap<String, Integer> sm = new HashMap<>();
        sm.put("4IKEC01", 99);
        sm.put("4IKEC02", 82);
        sm.put("4IKEC03", 77);
        sm.put("4IKEC04", 74);
        sm.put("4IKEC05", 58);

        Map<String, String> eligibleStudents = getStudents(sm);
        for (Map.Entry<String, String> entry : eligibleStudents.entrySet()) {
            System.out.println("Regs Number: " + entry.getKey() + ", Medal: " + entry.getValue());
        }
    }
	
	 public static Map<String, String> getStudents(HashMap<String, Integer> marksMap) {
	        Map<String, String> medals = new HashMap<>();

	        for (Map.Entry<String, Integer> entry : marksMap.entrySet()) {
	            String rN = entry.getKey();
	            int marks = entry.getValue();
	            String medal;

	            if (marks >= 90) {
	                medal = "Gold";
	            } else if (marks >= 80) {
	                medal = "Silver";
	            } else if (marks >= 70) {
	                medal = "Bronze";
	            } else {
	                continue;
	            }

	            medals.put(rN, medal);
	        }

	        return medals;
	    }


}
