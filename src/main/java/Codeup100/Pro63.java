package Codeup100;

import java.util.Scanner;

public class Pro63 {

    public static void main(String[] args) {
        // 정수를 입력했을 때 착수만 출력하기

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(a%2==0) {  // 조건이 참일 때만 실행되는 if문을 만들었어.
            // a%2의 의미는? a를 2로 나눈 나머지를 0과 비교한 결과 참 또는 거짓임.
            System.out.printf("%d\n", a);
        } if (b%2==0) {
            System.out.printf("%d\n", b);
        } if (c%2==0) {
            System.out.printf("%d\n", c);
        }
    }
}
