package Codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Pro71re {
    public static void main(String[] args) throws IOException {

        // 복습하고 내꺼로 만드셈 코드업 1073

        // 0이 입력될 때까지 무한 출력하기
        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); // 스캐너같은거
        StringTokenizer st = new StringTokenizer(sc.readLine());
        // 토크나이저 생성방식 3가지 있어.
        // new StringTokenizer(문자열); // 띄어쓰기 기준으로 분리
        // new StringTokenizer(문자열,구분자); // 구분자를 기준을 ㅗ분리
        // new StringTokenizer(문자열.구분자,true/false); // 구분자를 기준으로 문자열을 분리할때 구분자도 토큰으로 넣을지 말지 결정.

        // StringTokenizer 문자열을 토큰화 한다는 클래스임
        // 임포트하고 생성자까지 생성해야 쓸 수 있음, (조건에는 문자열을 넣어줌)

        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            if (s.equals("0")) {
                break;
            } else {
                System.out.println(s);
            }
        }
    }
}



