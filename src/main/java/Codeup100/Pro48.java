package Codeup100;

import java.util.Scanner;

public class Pro48 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (b<a) {
            System.out.printf("%d", 1);
        } else  {
            System.out.printf("%d", 0);
        }
    }
}
