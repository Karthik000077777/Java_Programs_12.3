package Frameworks;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList3 = new ArrayList<>();
        if(true){
            arrayList3.add("Green");
            arrayList3.add("Cyan");
            arrayList3.add("Purple");
            arrayList3.add("Orange");
        }
        System.out.println("Old ArrayList: " + arrayList3);
        System.out.print("Enter index to update colour: ");
        int index = sc.nextInt();
        System.out.print("Enter colour to be updated: ");
        String update_color = sc.next();
        arrayList3.add(index,update_color);
        System.out.println("New ArrayList: "+arrayList3);
    }
}
