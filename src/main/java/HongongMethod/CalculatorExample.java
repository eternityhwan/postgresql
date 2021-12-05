package HongongMethod;

public class CalculatorExample {

    public static void main(String[] args) {

        Calculator Calc = new Calculator();
        // Calculator 클래스에 생성자를 선언하지 않았기 때문에 기본 생성자 생성됨.

        Calc.powerOn(); // <- Calc 가 참조하는 객체로 가서 powerOn이라는 메소드를 실행해라 뜻.
                // 객체.메소드 <-- 어떤 객체에게 메소드를 실행하게 하라나는 뜻.
                // 실행하면 에러남 저장을 안하고 실행하면 에러 하면 에러 안남

        int result1 = Calc.plus(3,6);
        System.out.println("result1의 값은" + " " + result1);
        // plus의 결과값을 인트로 지정했기 때문에
        // int result1에 값을 저장해줘야함

        byte x = 10;
        byte y = 4;
        // 메소드에는 double 값으로 매개변수를 지정했고 여기는 byte니까 double 값이 더 크기 때문에
        // 자동으로 변환되어 메소드 double 값으로 계산됨.
        double result2 = Calc.divide(x,y);
        // 리턴타입이 더블이잖아 double result2니까.
        System.out.println("result2의 값은" + " " + result2);

        Calc.PowerOff();

    }
}
