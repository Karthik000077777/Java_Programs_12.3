package com.company;

class parent {
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
class child extends parent{
    void method2(){
        System.out.println("Method 2 in child class is called");
    }
}
public class Upcasting {
    public static void main(String[] args) {
	    parent obj = new child();  // Upcasting
        obj.method1();
        obj.method2();obj.method3();
    }
}
