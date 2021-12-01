package Codeup100;

import java.util.Scanner;

public class Pro23 {

    public static void main(String[] args) {

        Scanner kk = new Scanner(System.in);
        String nomu = kk.next();
        char c = nomu.charAt(0);
        char c1 = nomu.charAt(1);
        char c2 = nomu.charAt(2);
        char c3 = nomu.charAt(3);
        char c4 = nomu.charAt(4);
        System.out.printf("[%1s]\n",  c +"0000");
        System.out.printf("[%1s]\n",  c1 +"000");
        System.out.printf("[%1s]\n",  c2 +"00");
        System.out.printf("[%1s]\n",  c3 +"0");
        System.out.printf("[%1s]\n",  c4);
    }
}

//        int[] FiveArray = {2,3,4,5,6};
////        System.out.println(FiveArray[0]);
//
//        for(int i = 0; i < FiveArray.length; i++) {
//           System.out.printf("\%d\n",FiveArray[i]);
//        }

