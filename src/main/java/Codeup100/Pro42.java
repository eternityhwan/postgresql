package Codeup100;

import java.util.Scanner;

public class Pro42 {
    public static void main(String[] args) {
        // 나눗셈 진행 후 나머지 출력하기
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
//        int a = 10;
//        int b = 3;
//        System.out.printf("%d", (a/b)); // <- b값 3으로 a를 나누고 남은 나머지를 출력하는 클래스 소환
        // Math.floorMod -- 나머지 출력하는 클래스
        System.out.printf("%d",Math.floorMod(a,b));
    }
}
