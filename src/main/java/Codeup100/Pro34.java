package Codeup100;

import java.util.Scanner;

public class Pro34 {

    public static void main(String[] args) {

        // 스캐너 파일로 char값 A 를 받아와야하는함.
        // A 값이 스트링 타입이라는 것.
        // A 값을 정수값으로 저장하고
        // 10진수 값으로 출력하면 됨

        // 스캐너클래스로 가져올 수 있는 것이 스트링이라는 것.
        // 스트링을 char 타입을 바꾸는 법.
        // char 값을 int로 저장해야지 아스키코드로 값을 추출한다는 것.
        // 이 모두를 알아야 풀 수 있음.
        Scanner sc = new Scanner(System.in);
        String kick = sc.nextLine();
        char asci = kick.charAt(0);
        int nomukun = (int)asci;
        System.out.printf("%d",nomukun);
    }
}

//       int nomu = 'A';
//        System.out.printf("%d", nomu);
        // < 대단하게 뭐 할 것도 없다, 정수 값으로 A를 저장한 뒤 10진수 값으로 출력만 하면돼.

