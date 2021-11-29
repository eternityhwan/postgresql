package Codeup100;

public class Pro28 {

    public static void main(String[] args) {
        // 정수 하나 받아 그대로 출력하기
        // 2147483647  정수 출력 에러.

        long bignum = 2147483648l; // <-- 2147483648은 정수타입으로 저장 안됨, long으로 저장하고 값 뒤에 l 붙여주면 그냥됨.

        System.out.printf("%d",bignum);


    }
}
