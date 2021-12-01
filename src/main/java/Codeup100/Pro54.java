package Codeup100;

import java.util.Scanner;

public class Pro54 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a == 1 || b==1) { // a=1 b=1 이렇게 써서 안됐음
            System.out.printf("%d", 1);
        } else  {
            System.out.printf("%d", 0);
        }
    }
}

