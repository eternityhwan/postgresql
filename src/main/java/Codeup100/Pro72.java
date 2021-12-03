package Codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pro72 {
    public static void main(String[] args) throws IOException {

        // while 문 사용 방법 학습하기.
        Scanner sc = new Scanner(System.in);
        String nomu = sc.nextLine();
        int nomu2 = Integer.parseInt(nomu);
//        while (nomu2 > 0) { //
//            System.out.println(nomu2--);   // while 문 풀이 - nomu2변수(5)가 > 0 보다 작으면 참
//        }                                  // nomu2-- 5에서 하나씩 줄여나가다 0이되면 멈추게 더 이상 참이 아니라 출력 안됨.
//    }
        for (int i = 0; i < 5; i++) {
            System.out.printf("%s\n", nomu2--);
        }
    }
}


//        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
//
//        StringTokenizer nomu = new StringTokenizer(bf.readLine()); // <-- 여기까지하면 스트링을 개별로 받을 수 있게됨.
//
//        System.out.println(nomu[]);

//        for (int i = 0; i< nomu.countTokens(); i--) {
//            System.out.printf("%s\n", nomu);


