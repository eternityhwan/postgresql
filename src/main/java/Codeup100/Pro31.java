package Codeup100;

import java.util.Locale;
import java.util.Scanner;

public class Pro31 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hex = sc.nextInt();
//        int god = 255;

        System.out.printf("%s", Integer.toHexString(hex).toUpperCase(Locale.ROOT));
    }
}
