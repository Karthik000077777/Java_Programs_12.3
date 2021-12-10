package Frameworks;

import java.util.HashSet;
import java.util.Scanner;

public class HashSet_Q1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        hashSet.add("Green");
        hashSet.add("Cyan");
        hashSet.add("Purple");
        hashSet.add("Orange");
        System.out.println(hashSet);
    }
}
