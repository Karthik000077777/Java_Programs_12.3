package Frameworks;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Priority_Queue {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter size: ");
        int n1 = sc1.nextInt();
        PriorityQueue<String> pq = new PriorityQueue<>(n1);
        System.out.printf("Enter %d names to be inserted \n",n1);
        for (int i=0;i<n1;i++){
            pq.add(sc1.next());
        }
        for (String str :pq){
            System.out.println(str);
        }
    }
}