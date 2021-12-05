package HongongMethod;

public class Car3Example {

    public static void main(String[] args) {

        Car3 teslar = new Car3();

        teslar.seGas(5);

        boolean gasState = teslar.isLeftGas();
        if(gasState) {
            System.out.println("출발합니다.");
            teslar.run();
        }

    }
}
