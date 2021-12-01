package Codeup100;

import java.util.Scanner;

public class Pro18 {
    public static void main(String[] args) {

        // 주민등록 번호 입력 받아 형태 바꿔 출력
        // 앞 6자리는 생년월일 뒤 7자리는 성별 지역 오류검출코드이다.

        Scanner sc = new Scanner(System.in);

        String jumin = sc.next();

//        String[] nomu = jumin.split("[-]"); // 스플릿 메소드 쓸 필요 없는 예제

        jumin=jumin.replaceAll("-",""); // replace 메소드사용하여 치환함

        // 바꿈대상문자열=바꿈대상문자열.메소드("바뀔문자","대체문자")
        System.out.println(jumin);

    }
}



//        int sen1 = Integer.parseInt(nomu[0]);
//        int sen2 = Integer.parseInt(nomu[1]);
//
//        System.out.println(String.format("%d6%d6",sen1,sen2)); 이렇게하면 안나옴



//        String jumin = "9012131236818";
//        String[] spl = jumin.split(" "); // <- 이미 내가 스플릿 기능을 썼었네.

//        for(int i = 0; i <jumin.length(); i++) {
//            System.out.println(spl[i]);
//        }

//        System.out.println(jumin);
//        System.out.println(jumin.substring(0, 13));


