package Codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro76 {
    public static void main(String[] args) throws IOException {
        // 정수 1개를 입력받아 1부터 그 수까지 짝수의 합을 구해보라
        // step 1 -- 정수 1개를 받는다
        // step 2 -- 합을 받을 변수를 선언한다
        // step 3 --
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine());
        int sum = 0;
        for (int i = 1; i <=a; i++) { // 2 4
            if (i%2 ==0) {
                sum= sum + i;
            }
        } // <-- 여기까지가 for문입
            System.out.println(sum); // <- for문 끝난 여기에 출력을 해야 반복문이 두 번 작동 안함.
        }
    }

