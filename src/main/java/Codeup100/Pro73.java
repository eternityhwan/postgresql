package Codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro73 {
    public static void main(String[] args) throws IOException {

        // 5를 입력햇을 때 4 3 2 1 0 이 나옴 5가 나오면 안됨.

        BufferedReader sc = new BufferedReader(new InputStreamReader(System.in)); // 스캐너같은거

        int in = Integer.parseInt(sc.readLine());
        // parseInt는 버퍼리더 스캐너에서 읽고 리드라인 메소드로 받은 String 값을 정수로 바꿔주는 역할을 함.
        // BufferedReader 객체는 readline 메소드로 밖에 못읽어.
        // 임포트 추가, 예외처리까지 해줘 alt + enter

            while (in > 0) {

            System.out.println((in--)-1);
        }
    }
}
