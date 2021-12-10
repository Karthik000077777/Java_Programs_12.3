package com.company;
import java.lang.String;

abstract class Abstract1{
    abstract void method1();
}
abstract class Abstract2{
    abstract int method2(int a);
}
abstract class Abstract3{
    abstract String method3(String letters);
}

class implement1 extends Abstract1 {
    void method1() {
        System.out.println("Calling Abstract class method1");
    }
}
class implement2 extends Abstract2 {
    int method2(int a) {
        a=20;
        System.out.printf("Calling Abstract class method2 and int value is %d \n",a);
        return a;
    }
}
class implement3 extends Abstract3 {
    String method3(String letters) {
        letters = "Classroom";
        System.out.printf("Calling Abstract class method3 and String value is %s",letters);
        return letters;
    }
}



public class Abstract_class_method_calling {
    public static void main(String[] args) {
        implement1 ref1 = new implement1();
        ref1.method1();
        implement2 ref2 = new implement2();
        ref2.method2(20);
        implement3 ref = new implement3();
        ref.method3("String");

    }
}
