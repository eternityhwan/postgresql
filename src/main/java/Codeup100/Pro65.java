package Codeup100;

import java.util.Scanner;

public class Pro65 {

    public static void main(String[] args) {
        // 중첩 if문 사용 학습
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
        sc.close();
        if (a < 0) {
            System.out.println("minus");
        } else {
            System.out.println("plus");
        }
        if (a % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}