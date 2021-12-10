package Frameworks;

import java.util.*;

public class HashSet_Q5 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        System.out.println(h_set);
        System.out.println("No elements in HashSet: "+h_set.isEmpty());
        h_set.removeAll(h_set);
        System.out.println(h_set);
        System.out.println("No elements in HashSet: "+h_set.isEmpty());
    }
}