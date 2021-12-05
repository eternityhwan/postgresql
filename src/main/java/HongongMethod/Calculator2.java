package HongongMethod;

public class Calculator2 {

    //Field
    //Constructor
    //Method

    // 메소드 이름만으로 재활용 가능.

    int plus(int x, int y ) {
        int result = x + y;
        return result;
    }

    double avg(int x, int y) {
        double sum = plus(x, y);
        double result = sum / 2;
        return result;
    }

    void execute() {
        double result = avg(7,10);
        println("실행결과:" + result);
    }

    void println(String message) {
        System.out.println(message);
    }
}
