package Codeup100;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Pro17 {
    public static void main(String[] args) {


        Date today = new Date();
        SimpleDateFormat hourminute = new SimpleDateFormat("yyyy.mm.dd");

        System.out.println(today); // <- 현재 시간 To.String은 String 화 시켜준다는 것임.
        System.out.println(hourminute.format(today));
    }
}
