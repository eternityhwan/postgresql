package Codeup100;

import java.util.Scanner;

public class Pro66 {
    public static void main(String[] args) {
        // 점수 구간별 등급 표시하게 식 작성하도록 하라.

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        if (a >= 90) { // a가 90이상일 때 A 출력
            System.out.println("A");
        } else if (a >= 70) { // 70이상 90미만일 때 B 출력
            System.out.println("B");
        } else if (a >= 40) { // 40이상 69이하일 때 C 출력
            System.out.println("C");
        } else{
            System.out.println("D");
        }
    }
}
