package Frameworks;
        import java.util.ArrayList;
        import java.util.Scanner;

public class ArrayList_Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> arrayList2 = new ArrayList<>();
        if(true){
        arrayList2.add("Green");
        arrayList2.add("Cyan");
        arrayList2.add("Purple");
        arrayList2.add("Orange");
        }
        System.out.print("Enter index to get the colour: ");
        int index = sc.nextInt();
        String s = arrayList2.get(index);
        System.out.println(s);
    }
}
