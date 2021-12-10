package Frameworks;

import java.util.*;
import java.util.Iterator;

public class HashSet_Q2 {
    public static void main(String[] args) {
        HashSet<String> h_set = new HashSet<String>();
        h_set.add("Red");
        h_set.add("Green");
        h_set.add("Black");
        h_set.add("White");
        h_set.add("Pink");
        h_set.add("Yellow");
        Iterator<String> it = h_set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

