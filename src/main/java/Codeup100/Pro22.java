package Codeup100;

import java.util.Scanner;

public class Pro22 {
    public static void main(String[] args) {

        Scanner nomu = new Scanner(System.in);

        String exam = nomu.nextLine();

        // 문장을 한 글자씩 한 줄에 출력하라.
        // 반복문을 써야한다는 것은 직감적으로 알았으나
        // 어떤 기능으로 나눠 출력할 것인지는 모르는 상황.
        // 구글 검색 "문자열 나눠 출력"
        // charAt 기능 사용 결정.
        // charAt은 저장된 문자열 중에서 한 글자만 선택해서 char 타입을 변환해줌.
        for(byte i = 0; i < exam.length(); i++) {
            System.out.printf("\'%c\'\n",exam.charAt(i)); // charAt(). 괄호 안에는 출력해야할 인덱스 번호를 넣으면 됨.
                            // printf("출력양식쪽에 이스케이프 문으로 작은 따옴표 추가하면됨
        }
    }
}
