package Codeup100;

import java.util.Scanner;

public class Pro67 {
    public static void main(String[] args) {
        // 점수 구간별 등급 표시하게 식 작성하도록 하라.

        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        char nomu = a.charAt(0);
        sc.close();
        // case '출력되었을때' : 발동할 명령어 입력
        // break; 로 끊어줘야 다음 명령어가 실행이 안됨
        switch (nomu) {
            case 'A' : System.out.println("best!!!");
            break;
            case 'B' : System.out.println("good!!");
            break;
            case 'C' : System.out.println("run!");
            break;
            case 'D' : System.out.println("slowly~");
            break;
            default :
                System.out.println("what?");
                break;
            }
        }
    }

