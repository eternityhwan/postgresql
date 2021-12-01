package Codeup100;

import java.util.Scanner;

public class Pro56 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 0 && b==0)  {
            // 조건을 두 개 만들면됨 대신 참 괄호안에 넣어야됨.
            // 참 거짓이 서로 같을 때만 참 출력
            // 둘 다 거짓일 때 참 출력
            // 참 숫자 1, 거짓 0
            // a b 둘다 0일 때 1출력하게하면됨
            System.out.printf("%d", 1);
        } else  {
            System.out.printf("%d", 0);
        }
    }
}
