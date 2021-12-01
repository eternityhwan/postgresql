package Codeup100;

import java.util.Scanner;

public class Pro14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        float nomu = sc.nextFloat();

        System.out.printf("%.2f",nomu);
    }
}
// printf("출력 서식", 출력할 내용);
// printf 출력서식에 소숫점 둘 째 자리만 나오게 명령문 입력한다.
// %n 줄바꿈
// %.nf < float 타입에서 소숫점의 n번째까지 표기하겠다는 뜻임.
// %d 10진수
// %c 문자 등