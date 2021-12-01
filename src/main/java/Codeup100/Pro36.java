package Codeup100;

import java.util.Scanner;

public class Pro36 {
    public static void main(String[] args) {
        // 두 정수의 합을 구하는 문제
        // 자바로 풀려면 long 타입 선언해야함.
        // 값이 커서 int 타입 선언하면 안됨.

        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long y = sc.nextLong(); // 롱타입이면 옆에 스캐너로 받는 메소드도 nextlong으로 받아야해
        System.out.printf("%d", x+y);
    }
}
// 정수 2개를 입력받아 합을 출력하는 프로그램 작성하기.

//        int x = 5;
//        int y = 6;
//
//        System.out.printf("%d", x+y);

