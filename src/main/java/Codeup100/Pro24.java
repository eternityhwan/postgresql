package Codeup100;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pro24 {

    public static void main(String[] args) {
        // 입력되는 시분초에서 분만 출력하기

        // Date 클래스(메소드까지 다 들어있음)를 소환, today 변수 지정, date변수를 today에 대입
        // SimpleDateFormat 클래스 소환, hourminute 변수 선언하고 SimpleDateFormat()를 hourminute에 값부여
        // 인스턴스화, 즉 객체 생성을 해줘야 today, hourminute 변수를 사용 할 수 있어.

        Date today = new Date();

        SimpleDateFormat hourminute = new SimpleDateFormat("mm");

//        System.out.println(today); // <- 현재 시간 To.String은 String 화 시켜준다는 것임.
        System.out.println(hourminute.format(today));
    }
}
