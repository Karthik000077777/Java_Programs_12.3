// https://www.w3resource.com/java-exercises/collection/index.php#arraylist
package Frameworks;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
public class ArrayList_Q1_Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size: ");
        int size = sc.nextInt();
        ArrayList<String> arrayList = new ArrayList<>(size);
        System.out.printf("Enter %d colors to be included \n",size);
        for(int i=0;i<size;i++){
            arrayList.add(sc.next());
        }
        Collections.sort(arrayList);
        System.out.println(arrayList);
//        for(String s:arrayList){
//            System.out.println(s);
//        }
    }
}
