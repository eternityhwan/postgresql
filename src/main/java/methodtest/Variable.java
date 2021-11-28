package methodtest;

public class Variable {
    public static void main(String[] args) {

        int e;
        int hour = 3;
        int minute = 5;

        // 변수를 초기화 해주지 않으면 읽을 수 없다.
        // System.out.println(e); <- 초기화 되지 않은 e를 출력하려면 에러남.

        System.out.println(hour + "시간" + minute + "분"); // < value 변수에 + 10을 더한 result 변수를 출력하라는 뜻임.

        int totalMinute = (hour*60) + minute;

        System.out.println("총" + totalMinute + "분"); // +는 산술연산 아니야,
    }
}
