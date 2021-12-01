package Codeup100;

import java.util.Scanner;

public class Pro55 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 && b==0 || (a == 0 && b==1))  {
            // 조건을 두 개 만들면됨 대신 참 괄호안에 넣어야됨.
            System.out.printf("%d", 1);
        } else  {
            System.out.printf("%d", 0);
        }
    }
}
