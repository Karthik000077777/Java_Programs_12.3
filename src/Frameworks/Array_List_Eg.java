package Frameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Array_List_Eg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<Integer> arrayList = new ArrayList<>(n);
        System.out.printf("Enter %d integers to be inserted \n",n);
        for(int i=0;i<n;i++) {
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);
        for (Integer num : arrayList){
            System.out.println(num);
        }
    }
}
