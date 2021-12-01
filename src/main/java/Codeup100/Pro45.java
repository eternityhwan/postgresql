package Codeup100;

import java.util.Scanner;

public class Pro45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a + b + c);
        System.out.printf("%.1f\n",(float)(a + b + c)/3);
        // 연산에 혼동 없이 덧셈값에 괄호를 씌워주면 된다.
    }
}
