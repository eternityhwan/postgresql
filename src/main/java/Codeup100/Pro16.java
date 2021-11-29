package Codeup100;


import java.text.SimpleDateFormat;
import java.util.Date; // < java.sql이 아니라 java.utill 을 가져와야함, sql은 시분초 정보가 없음.

public class Pro16 {
    public static void main(String[] args) {
        // 오늘 시간을 시간:분 으로 출력 하는 것이 목적이다.
        // 첫 번째로 오늘 날짜를 가져온 후
        // 두 번째로 오늘 시각에서 시간과 분만 추출할 것임.

        // 1. 오늘 시각 가져오기
        // Date 클래스 호출 후 today 변수 선언
        // new 타입 Data()변수를 today 변수에 값을 넣어줘 사용할 수 있는 상태로 만들어줘야함

        // 2. 시간:분 만 출력해줄 포맷기능 SimpleDataFormat 을 사용함
        // SimpleDateFormat 타입 변수 hourminute선언 후
        // SimpleDateFormat (패턴)을 hourminute에 넣어준다.

        // new 하고 클래스네임쓰는건 인스턴스화(객체로 만들어주는 시킨다는것
        // 인스턴스화를 시킨다는건 메모리화 시킨다는 것 이때부터 쓸 수 있어

        // 3. 그리고 출력하면 됨.
        Date today = new Date();
        SimpleDateFormat hourminute = new SimpleDateFormat("HH:mm:ss");
        System.out.println(today); // <- 현재 시간 To.String은 String 화 시켜준다는 것임.
        System.out.println(hourminute.format(today));

    }

}
