package Frameworks;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet_Q2 {
    public static void main(String[] args) {
        TreeSet<String> tree_set = new TreeSet<String>();
        tree_set.add("Red");
        tree_set.add("Green");
        tree_set.add("Orange");
        tree_set.add("White");
        tree_set.add("Black");
        Iterator<String> it = tree_set.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+";"+" ");
        }
//        for (String element : tree_set) {
//            System.out.println(element);
//        }
    }
}
