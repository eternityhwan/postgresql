package Codeup100;

public class Pro13 {
    public static void main(String[] args) {
        // 문자 2개 입력받아 순서 바꿔 출력하기
        // 스텝 1 : 출력할 변수 a, b, 선언
        // moon 변수에 지정한 b가 앞에 나오고, nomu 변수 a가 뒤에 나와야함
        // 순서 지정을 위한 변수 x, y 지정 후 먼저 출력할 b를 moon변수에 지정 x에 저장,
        // 뒤에 출력할 A를 nomu 변수에 지정 후 출력함.
        // x + y 하면 B  A 가 나오고
        // y + x 하면 A  B 가 나옴
        char nomu = 'A';
        char moon = 'B';

        char x = moon;
        char y = nomu;




        System.out.print(x + "  " + y);

    }
}
