package com.company;

import jdk.swing.interop.SwingInterOpUtils;

// Creating Interface...................................................................................................
interface Interface1{
    void Interface_method_1(); // Method() in an interface class, no constructors allowed;
}
// Creating another interface...........................................................................................
interface Interface_2{
    void Interface_method_2(); // Method() in an interface class, no constructors allowed;
}
// Creating abstract Class..............................................................................................
abstract class Abstract {
    abstract  void Abstract_method_1(); // Abstract class method();
    abstract  void Abstract_method_2(); // Abstract class constructor;
}
// Creating Implementation Class........................................................................................
    class Implementation extends Abstract implements Interface1,Interface_2{
        void Abstract_method_1()                     // Defining Abstract_method_1
        {
            System.out.print("Captain America, ");
        }
        void Abstract_method_2() {                  // Defining Abstract_method_2
            System.out.print("Hulk, ");
        }
        public void Interface_method_1() {      // This method should be declared as public otherwise it will be seen as Two methods with same name (clashes);
            System.out.print("Iron-man, ");
        }
        public void Interface_method_2() {      // This method should be declared as public otherwise it will be seen as Two methods with same name (clashes);
            System.out.print("Ant-man");
        }
}
// Main method for calling all methods..................................................................................
public class Interface_with_abstract_class {
    public static void main(String[] args)
    {
        System.out.println("");
        System.out.println("AVENGERS ASSEMBLE");
        Implementation ref = new Implementation();
        ref.Abstract_method_1();
        ref.Abstract_method_2();
        ref.Interface_method_1();
        ref.Interface_method_2();
        System.out.println("");
    }
}
