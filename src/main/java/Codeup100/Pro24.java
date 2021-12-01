package Codeup100;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pro24 {

    public static void main(String[] args) {
        // 입력되는 시분초에서 분만 출력하기
        Scanner sc = new Scanner(System.in);
        String Time = sc.nextLine();
        String[] seperate = Time.split(":");

          System.out.println(Integer.valueOf(seperate[1]));
//        System.out.println(String.format("%.2s",seperate[1])); // < %.1 이렇게 제한하면 1자리만 나옴


        // String format 이용해서 해보기.
        // <Integer.valueof 문자열의 값을 정수로 변환하고 정수 객체로 반환.
        //        System.out.printf("%1s",seperate[0]);
    }
}


// 아래 방법은 오늘 날짜를 출력하는 것,
        // Date 클래스(메소드까지 다 들어있음)를 소환, today 변수 지정, date변수를 today에 대입
        // SimpleDateFormat 클래스 소환, hourminute 변수 선언하고 SimpleDateFormat()를 hourminute에 값부여
        // 인스턴스화, 즉 객체 생성을 해줘야 today, hourminute 변수를 사용 할 수 있어.
//
//        Date today = new Date();
//
//        SimpleDateFormat hourminute = new SimpleDateFormat("mm");
//
////        System.out.println(today); // <- 현재 시간 To.String은 String 화 시켜준다는 것임.
//        System.out.println(hourminute.format(today));
