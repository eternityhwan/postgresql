package Codeup100;

import java.util.Scanner;

public class Pro61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 3항 연산자 ?를 사용하여 둘 중 큰 값을 출력하기

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d", a>b ? a:b);

        // if문 사용하지 않고 비교연산하는 것임
        // 3항 연산자 ?를 사용한다.
        // a를 123> b를 456 ? 0(참):1(거짓)
        // 위에 뜻이다. 연간결과거 거짓이기 때문에 1이 답이다.
        // 더 큰 값 456이 출력 된다.
    }
}
