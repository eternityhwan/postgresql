package Codeup100;

import java.util.Scanner;

public class Pro44 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a+b); // 합
        System.out.println(a-b); // 차
        System.out.println(a*b); // 곱
        System.out.println(a/b); // 몫
        System.out.println(Math.floorMod(a,b)); // 나머지
        System.out.printf("%.2f\n", (float)a/b); // 실수 둘째짜리까지
        // 정수값 ab를 나눈 값의 소숫점 2자리까지 나오게해야해, float 타입 선언안해주면 에러나와.
        // printf에 타입 설정해줄 때도 %.2f < f 타입 선언해줘야 소숫점 둘째자리나옴, 우측에도 마찬가지.
    }
}
