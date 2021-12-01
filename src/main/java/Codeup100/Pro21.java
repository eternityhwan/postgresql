package Codeup100;

import java.util.Scanner;

public class Pro21 {
    public static void main(String[] args) {

        // 정부부분 따로, 소수점 이하 부분 따로 출력해해
        Scanner mukun = new Scanner(System.in);

        String yes = mukun.nextLine();

        String seperate[] = yes.split("[.]");

        System.out.println(seperate[0]);
        System.out.println(seperate[1]);
    }
}

//       float pi = 1.414213f;
//       pi = Math.round(pi);
//
//        System.out.println((int)pi);
//
//        System.out.printf("%0.6",pi);

