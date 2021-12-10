package Frameworks;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        ArrayList<String> arrayList1 = new ArrayList<>(size);
        System.out.printf("Enter %d colors to be inserted \n",size);
        for (int i=0;i<size-1;i++){
            arrayList1.add(sc.next());
        }
        System.out.println(arrayList1);
        arrayList1.add(0,"Green");
        System.out.println(arrayList1);
    }
}
