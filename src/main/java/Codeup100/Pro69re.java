package Codeup100;

import java.util.Arrays;
import java.util.Scanner;

public class Pro69re {

    public static void main(String[] args) {

        // 정수값 7 4 2 3 0 1 5 6 9 10 8 를 받아서
        // 한 줄씩 출력하다  0이 나오면 멈추는 식을 만든다.
        //
        // 스텝 1 정수 값을 받는다.
        // 스텝 2 정수 값을 배열로 저장한다.
        // 저장한 배열값을 출력하다 0값이 나오면 멈추게 지시힌다.
        Scanner sc = new Scanner(System.in);

        String nomu = sc.nextLine();
        String[] nomu2 = nomu.split(" ");

        for (int i = 0; i < nomu2.length; i++) {
                if (nomu2[i].equals("0")) {
                    break;
                }
            System.out.println(nomu2[i]);
        }
    }
}

//        while (true) {
//            if (nomukun == 0) {
//                System.out.printf("%d", nomukun);
//                break;




