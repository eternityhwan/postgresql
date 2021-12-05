package HongongStaticmember;

public class CalculatorAction {
    public static void main(String[] args) {
        // 실행 클라스
        // 원의 넓이 pi값을 곱해주면 됨.

        double result1 = 10 * 10 * Calculator.pi;
        int result2 = Calculator.plus(10,5);
        // 같은 패키지에 Calculator 클래스에 있는 정적 맴버 plus메소드를 가저옴
        int result3 = Calculator.minus(10,5);

        System.out.println("result1 :" + result1);
        System.out.println("result2 :" + result2);
        System.out.println("result3 :" + result3);
    }
}
