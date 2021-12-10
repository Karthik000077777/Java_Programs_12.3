package com.company;

class Super {
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
class sub extends Super{
    void method2(){
        System.out.println("Method 2 in child class is called");
    }
}
public class Down_casting {
    public static void main(String[] args) {
        Super obj = new sub();  // Upcasting
        obj.method1();
        sub s = (sub)obj;  // Downcasting
        s.method1();s.method2();s.method3();

    }
}
