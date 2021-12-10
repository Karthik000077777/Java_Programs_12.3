//import java.util.regex.Pattern;
//
//public class Test {
//    public static void main(String[] args) {
//       String username1 = "20xAu,";
//       String username2 = "40xAu.";
//        System.out.println(Pattern.matches("^([1-3][0-2][xs0][30Aa][xsu][.,])$", username1));//true
//        System.out.println(Pattern.matches("^([1-3][0-2][xs0][30Aa][xsu][.,])$", username2));//false
//    }
//
//}


//public class Test {
//    public static void main(String[] args) {
//        int a = 4;a++; a += a; --a; a = 7 + a; a *= a; a -= 3; System.out.println(" a = " + a );
//    }
//}

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr1 = new int[4];
        int [] arr2 = new int[4];
        for(int i=0;i<4;i++){
            arr1[i]=sc.nextInt();
        }
        for(int j=0;j<4;j++){
            arr2[j]=sc.nextInt();
        }
        
    }
}