package Codeup100;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Pro17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 내가 .을 찍지 않고 연속 입력할 때도 자연스럽게 .이 찍히게 하여야함.

        String yymmdd = sc.next();

        String date[] = yymmdd.split("[.]"); // split()괄호안에 [.] 기준으로 나눌 것이다는 명령임.
        // 스캐너로 입력된 yymmdd 명령어를 나눌 기준을 정해주는거다 split("[regex]"); regex 기준으로 나눔

        int year = Integer.parseInt(date[0]);
        int month = Integer.parseInt(date[1]);
        int day = Integer.parseInt(date[2]);

        System.out.println(String.format("%04d.%02d.%02d", year, month, day));
    }
}
//        Date today = new Date();
//        SimpleDateFormat hourminute = new SimpleDateFormat("yyyy.mm.dd");
//
//        System.out.println(today); // <- 현재 시간 To.String은 String 화 시켜준다는 것임.
//        System.out.println(hourminute.format(today));
