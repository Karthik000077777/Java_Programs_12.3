package Frameworks;

import java.util.TreeSet;

public class TreeSet_Q3 {
    public static void main(String[] args) {
        TreeSet<String> tree_set1 = new TreeSet<String>();
        tree_set1.add("Red");
        tree_set1.add("Green");
        tree_set1.add("Orange");
        System.out.println("Tree set1: "+tree_set1);
        TreeSet<String> tree_set2 = new TreeSet<String>();
        tree_set2.add("Pink");
        tree_set2.add("White");
        tree_set2.add("Black");
        System.out.println("Tree set2: "+tree_set2);
        TreeSet<String> tree_set3 = new TreeSet<String>();
        tree_set3.addAll(tree_set1);
        tree_set3.addAll(tree_set2);
        System.out.println("Tree set3: "+tree_set3);
    }
}
