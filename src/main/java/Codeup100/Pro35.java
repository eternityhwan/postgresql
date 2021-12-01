package Codeup100;

import java.util.Scanner;

public class Pro35 {
    public static void main(String[] args) {
        // 아스키 코드를 받아 정수로 출력하기
        // 정수 타입으로 65를 저장하고
        // 캐릭터 타입으로 출력하면 됨.

        Scanner sc = new Scanner(System.in); // 스캐너 객체 생성 -- 객체가 있어야 사용도 됨.
        int nomugeun = sc.nextInt(); // 정수 타입 노무군 변수 선언 스캐너 객체(sc)를 nextint메소드로 가동
//        System.out.println(nomugeun);
        System.out.printf("%c",nomugeun); // 정수 타입의 노무군 변수를 char 타입으로 출력 명령
    }
}

//        System.out.printf("%d", sixsix + 1); // 정수 타입 nomu 변수에 65 저장 후 문자로 출력


//        char sixsix = sc.nextLine().charAt(0);
//        // 위 코드에서는 마지막 charAt(인덱스0번)이 타입을 char로 바꿔줘 성립됨.
//        // 원칙적으로 스캐너 클래스는 String 만 받음.
//        int hyun = sixsix;


//    int nomu = 65;