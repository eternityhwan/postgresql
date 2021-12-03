package Codeup100;

import java.util.Scanner;

public class Pro70re {
    public static void main(String[] args) {

        // n개의 정수를 한 개씩 줄을 바꿔 출력한다
        // 먼저 값을 받는다.

        // 출력이 어느 블럭에서 되는지 이해 못한다함.
        // 아래 조건문이 작동 안함
        // 입력만 받는 정수를 만들고
        // 출력만 되는 정수를 만들어서 계단 출력하면 되는 문제였음.

        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        String[] nomu2 = b.split(" ");


        int cnt = 0;
        for (int i = 0; i < nomu2.length; i++) { // 두번째 줄을 출력하게 만듦 이건 완성
            System.out.println(nomu2[i]);// 1 2 3 4 5 이렇게 입력하면 계단식으로 나옴.
//            if (a.equals(nomu2[i])) {
////                System.out.printf("11111%s\n", "");
            }
        }
//        System.out.printf("cnt:%s", cnt);
    }



