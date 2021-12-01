package Codeup100;

public class Pro44 {

    public static void main(String[] args) {

    int a = 10;
    int b = 3;

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(Math.floorMod(a,b));
        System.out.printf("%.2f\n", (float)a/b);
        // 정수값 ab를 나눈 값의 소숫점 2자리까지 나오게해야해, float 타입 선언안해주면 에러나와.
        // printf에 타입 설정해줄 때도 %.2f < f 타입 선언해줘야 소숫점 둘째자리나옴, 우측에도 마찬가지.

    }
}
