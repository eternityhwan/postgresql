package Codeup100;

import java.util.Scanner;

public class Pro33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomu = sc.nextLine();

        int octal = Integer.valueOf(nomu, 16);

        // < valueof 메소드사용하려면 int값으로 출력해야함
        // 때문에 int 타입 변수를 선언해줘야 저장이 가능함
        // String 클래스 소환하면 에러남.

        System.out.printf("%o", octal);
    }
}
