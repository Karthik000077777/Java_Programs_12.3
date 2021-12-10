//package com.company;
//import java. util.Scanner;
//import java.lang.Math;
//
//class Utility {
//        public static Scanner sc = new Scanner(System.in);
//        static int fahrenheitToCelcius(double fah) {
//        double f = (fah - 32) * 5 / 9;
//        return (int) Math.round(f);
//    }
//        static String getLevel(int n) {
//        int sum = 0;
//        String result;
//        int[] arr = new int[n];
////        Scanner sc = new Scanner(System.in);
//        System.out.printf("Enter %d elements",n);
//            System.out.println("");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt();
//        }
//        for (int i = 0; i < n; i++) {
//            sum += arr[i];
//        }
//        if (sum >= 100) {
//            result = "HIGH";
//        } else if (sum >= 70) {
//            result = "Medium";
//        } else {
//            result = "LOW";
//        }
//        return result;
//    }
//}
//class Source {
//    public static void main(String[] args) {
//        Scanner s1 = new Scanner(System.in);
//        System.out.println("Select your option 1 or 2");
//        int option = s1.nextInt();
//        if (option == 1) {
//            System.out.println("Enter temparature in fahrenheit");
//            double fah = s1.nextDouble();
//            System.out.print(Utility.fahrenheitToCelcius(fah));
//        }
//        if (option == 2) {
//            System.out.println("Enter number ot array elements:");
////            Scanner s2 = new Scanner(System.in);
//            int n = s1.nextInt();
//            s1.
//            System.out.println(Utility.getLevel(n));
//        }
//    }
//}
