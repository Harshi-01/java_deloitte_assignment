package com.deloitte.lab6.Ex6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab6Ex6 {


	   public static void main(String[] args) {
	        Map<String, Integer> p = new HashMap<>();
	        p.put("IDP1", 20);
	        p.put("IDP2", 17);
	        p.put("IDP3", 19);
	        p.put("IDP4", 16);
	        p.put("IDP5", 22);

	        List<String> eligibleVoters = votersList(p);
	        System.out.println("Eligible Voter IDs: " + eligibleVoters);
	    }
    public static List<String> votersList(Map<String, Integer> people) {
        List<String> eligibleVoters = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : people.entrySet()) {
            String id = entry.getKey();
            int age = entry.getValue();

            if (age > 18) {
                eligibleVoters.add(id); 
            }
        }

        return eligibleVoters;
    }

 

}
