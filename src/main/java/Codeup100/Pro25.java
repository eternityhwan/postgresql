package Codeup100;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pro25 {
    public static void main(String[] args) {
        // 미션
        // 년월일을 출력 받아 일/월은 0을 붙여 두 자리로 년도도 0을 붙여 네자리로 출력한다

        Scanner sc = new Scanner(System.in);
        String yymmdd = sc.next();

        String[] nomumine = yymmdd.split("\\."); // 문자열 nomumine 을선언, yymmdd에 입력된 문자열을 .기준으로 나눌것
        System.out.printf("%02d-%02d-%4d", Integer.valueOf(nomumine[2]),Integer.valueOf(nomumine[1]),Integer.valueOf(nomumine[0]));
        // 02라고 써야 0이 나옴, %2d 이렇게만 쓰면 숫자만 나옴.
         }
    }

// Integer.valueof -- 둘 다 문자열을 정수값으로 변환하는 것
        // Integer.parseint -- 문자열을 정수값으로 변환하는 것.

//        System.out.printf("%02s-%02s-%04s", Integer.valueOf(nomumine[2]),Integer.valueOf(nomumine[1]),Integer.valueOf(nomumine[0]));

// Date 클래스(메소드까지다들어있는) 소환 후 Today 변수 선언 후
        // Date() 값을 Today 변수에 넣는다.

        // 그렇게되면 변수 Today를 출력하면 Date 클래스가 출력 될 것이다.
        // 하지만 이쪽에서는 yyyy-mm-dd 형식만 출력해야하기 때문에 Today 변수에서 해당 날짜만 출력해야한다.

        // SimpledateFormat(단순날짜양식) 클래스 소환 임의의 변수 yearmonth 선언
        // yearmonth 변수에 SimpleDateFormat을 주입해준다.(양식 입력)
        // 출력해야하는 부분은 simpledateformat 기능을 주입한 yearmonth 객체를 이용해
        // Today에서 필요 양식만 추출하면 된다.

        // 즉 객체를 사용하여 Today 변수에서 객체를 추출하는 것임.

//        Date Today = new Date();
//        SimpleDateFormat yearmonth = new SimpleDateFormat("yyyy.MM.dd");
//
//        System.out.println(Today);
//        System.out.println(yearmonth.format(Today));

