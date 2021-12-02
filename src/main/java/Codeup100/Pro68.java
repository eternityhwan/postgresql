package Codeup100;

import java.util.Scanner;

public class Pro68 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    sc.close();
    // case '출력되었을때' : 발동할 명령어 입력
    // break; 로 끊어줘야 다음 명령어가 실행이 안됨

        switch (a) {
            case 12 :
            case 1 :
            case 2 :
                System.out.println("winter");
            break;
            case 3 :
            case 4 :
            case 5 :
                System.out.println("spring");
            break;
            case 6 :
            case 7 :
            case 8 :
                System.out.println("summer");
            break;
            case 9 :
            case 10 :
            case 11 :
                System.out.println("fall");
            break;
         }
    }
}
