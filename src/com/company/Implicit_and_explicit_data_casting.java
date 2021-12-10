package com.company;

public class Implicit_and_explicit_data_casting {
    public static void main(String[] args) {
        int a=2; double c=2.3;
        double Sum = a+c; // implicit
        int sum = (int) (a+c); // explicit
        System.out.println(Sum);
        System.out.println(sum);
    }
}
