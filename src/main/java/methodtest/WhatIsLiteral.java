package methodtest;

public class WhatIsLiteral {

    public static void main(String[] args) {
            // 리터럴
            // 소스 코드에서 프로그래머에 의해 직접 입력된 값
            // 자바에서는 정수로 인식한다.

        int v1 = 15; // v1 변수 메인 메소드 블럭에서 실행됨.
        if (v1 > 10) { // if 블록 내부에서는 v2 변수가 실행되었다.
            int v2;
            v2 = v1 = 10;
        }
        int var1 = 0b1011;

        System.out.println(var1);
    }
}
