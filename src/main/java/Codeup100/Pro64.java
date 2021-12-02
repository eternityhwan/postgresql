package Codeup100;

import java.util.Scanner;

public class Pro64 {
    public static void main(String[] args) {
        // 세 정수가 입력되었을 때 짝 수와 홀 수를 출력하라.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        // 여러 if문 작성하다 에러나기 쉬움 괄호 구분 철저.
        if (a%2==0) {
            System.out.printf("%s\n", "even");
        } else {
            System.out.printf("%s\n", "odd");
        }
        if (b%2==0) {
            System.out.printf("%s\n", "even");
        } else {
            System.out.printf("%s\n", "odd");
        }
        if (c%2==0) {
            System.out.printf("%s\n", "even");
        } else {
            System.out.printf("%s\n", "odd");
        }
    }
}