package com.company;

class Super1 {
    void method1() {
        System.out.println("Method 1 in parent class is called");
    }

    void method2() {
        System.out.println("Method 2 in parent class is called");
    }

    void method3() {
        System.out.println("Method 3 in parent class is called");
    }
}
class sub1 extends Super1{
    void method2(){
        System.out.println("Method 2 in child class is called");
    }
}
public class check {
    public static void main(String[] args) {
        sub1 obj = new sub1();
        obj.method1();

    }
}
