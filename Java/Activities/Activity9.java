package activities;

import java.util.ArrayList;

public class Activity9 {
    public static void main(String[] args) {
        
        ArrayList<String> myList = new ArrayList<String>();
        
        myList.add("Raja");
        myList.add("Sekhar");
        myList.add("Reddy");
        myList.add("IBM");
        myList.add(4, "Vaka");
        
        System.out.println("Print All the Objects:");
        for(String s:myList){
            System.out.println(s);
        }
        
        System.out.println("3rd element in the list is: " + myList.get(2));
        System.out.println("Is VRSR is in list: " + myList.contains("VRSR"));
        System.out.println("Is VAKA is in list: " + myList.contains("VAKA"));
        System.out.println("Is Vaka is in list: " + myList.contains("Vaka"));
        System.out.println("Size of ArrayList: " + myList.size());        
        myList.remove("IBM");
        System.out.println("New Size of ArrayList: " + myList.size());
    }
}