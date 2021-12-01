package Codeup100;

import java.util.Scanner;

public class Pro57 {

        // 비트단위로 not 하여 출력하기?
        // ~(tilde, 틸드)만 붙이면 되는데 이게 뭐야.
        // 컴퓨터에 저장되려면 2진수로 바뀌어 저장되어야하는데
        // 0,1로 변환되어 저장된다는 이야기다.
        // 양의 정수 2진수 형태로 저장
        // 음의 정수는 2의 보수 표현 바법으로 저장
        // 한마디로 2진수로 저장된다고 보면된다
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(~a);
    }
}
