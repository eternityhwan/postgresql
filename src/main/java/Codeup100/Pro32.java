package Codeup100;

import java.util.Scanner;

public class Pro32 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nomu = sc.nextLine();

        int num = Integer.valueOf(nomu, 8); // <- radix 이게 진수라는 거임 8진수로 바꾼다는 뜻.

        System.out.printf("%d", num); // <-- 이렇게 출력하면 int num 8진수로 변환전 값이 출력됨.

//        System.out.printf("%o", nomu); // < -- 10진수 13을 8진수로 변환.
    }
}
