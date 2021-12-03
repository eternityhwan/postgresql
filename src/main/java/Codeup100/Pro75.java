package Codeup100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pro75 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bf.readLine());
        // BufferReader 로 int 값 받기, 스트링으로 저장되니 parseInt() 괄호안에 String 값을 넣어줘.
        // 그래야 int 값으로 변환 가능하다.

        for (int i =0; i <=a; i++) {
            System.out.println(i);
        }
    }
}
