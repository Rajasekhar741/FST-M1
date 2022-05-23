package activities;

import java.util.HashMap;

public class Activity11 {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        hash_map.put(1, "Red");
        hash_map.put(2, "Blue");
        hash_map.put(3, "Green");
        hash_map.put(4, "Yellow");
        hash_map.put(5, "White"+" Purple");

        System.out.println("The Original map: " + hash_map);
        
        hash_map.remove(4);
        System.out.println("After removing White: " + hash_map);
        
        if(hash_map.containsValue("White")) {
            System.out.println("White exists in the Map");
        } else {
            System.out.println("White does not exist in the Map");
        }
        
        if(hash_map.containsValue("White Purple")) {
            System.out.println("White Purple exists in the Map");
        } else {
            System.out.println("White Purple does not exist in the Map");
        }
        
        System.out.println("Map Size: " + hash_map.size());
    }
}