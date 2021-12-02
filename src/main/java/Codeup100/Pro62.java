package Codeup100;

import java.util.Scanner;

public class Pro62 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        // 3항 연산자 ?를 사용하여 셋 중 가장 작은 값 출력
        // 3항 연산자 여러개 산출하는 방법을 알아야해

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a>b ? b>c ? c:b : a>c ? c:a );
    }
}
//        System.out.printf("%d", a>b ? b>c ? c:b : a>c ? c:a);
        // 삼항연산자 엑셀 if로 보면 됨 ?(if)
        // a가 b보다 작으면 b와 c 를 비교해서 b가 더 작다면 c를 출력 아니면 b를 출력해
        // 아니면 a가 c보다 작다면 c를 출력하고 아니면 a를 출력해해
