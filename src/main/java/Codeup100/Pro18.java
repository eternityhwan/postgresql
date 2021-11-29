package Codeup100;

public class Pro18 {
    public static void main(String[] args) {
        // 주민등록 번호 입력 받아 형태 바꿔 출력
        // 앞 6자리는 생년월일 뒤 7자리는 성별 지역 오류검출코드이다.

        String jumin = "9012131236818";
        String[] spl = jumin.split(" ");

//        for(int i = 0; i <jumin.length(); i++) {
//            System.out.println(spl[i]);
//        }

        System.out.println(jumin);
        System.out.println(jumin.substring(0, 13));


    }
}
