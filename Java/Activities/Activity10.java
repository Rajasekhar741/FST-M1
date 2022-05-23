package activities;

import java.util.HashSet;

public class Activity10 {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        
        hs.add("Raja");
        hs.add("Sekhar");
        hs.add("Reddy");
        hs.add("Vaka");
        hs.add("Tester");
        hs.add("IBM");
        
      
        System.out.println("HashSet: " + hs);        
        System.out.println("Size of HashSet: " + hs.size());
        
        System.out.println("Remove Tester from HashSet: " + hs.remove("Tester"));
        if(hs.remove("QA")) {
        	System.out.println("QA removed from the Set");
        } else {
        	System.out.println("QA is not present in the Set");
        }
        
        System.out.println("Checking if Reddy is present: " + hs.contains("Reddy"));
        System.out.println("Updated HashSet: " + hs);
    }
}