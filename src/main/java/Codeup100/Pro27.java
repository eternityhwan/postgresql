package Codeup100;

import java.util.Scanner;

public class Pro27 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Double bongha = sc.nextDouble();

        System.out.printf("%.11f\n",bongha); // <- 그냥 소수로 나옴, -- %.11f 는 소숫점 이하로 11자리까지 실수로 표기한다고 포멧을 정한거야.
//        System.out.println(bongha); // <- 이렇게 출력하면 부동소수로
    }
}
