package exam03;

public class CarExample {
    // Car 클래스에 실행 클래스이다.
    public static void main(String[] args) {

        Car car1 = new Car(); // Car 매개변수없던 객체가 만들어졌어
        System.out.println(car1.company);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.maxSpeed);

        Car car2 = new Car("자가용"); // <- Car 클래스에 문자열
        System.out.println(car2.company);
        System.out.println(car2.model);
        // 이 생성자는 문자열하나를 받아 Car 클래스에 model 값을 출력하게함.
        System.out.println(car2.color);
        System.out.println(car2.maxSpeed);

        Car car3 = new Car("자가용","red"); // <- Car 클래스에 문자열
        System.out.println(car3.company);
        System.out.println(car3.model);
        // 이 생성자는 문자열 두 개를 받아 Car 클래스에 model, color 값을 출력하게함.
        System.out.println(car3.color);
        System.out.println(car3.maxSpeed);

        Car car4 = new Car("택시","검정", 200); // <- Car 클래스에 문자열
        System.out.println(car4.company);
        System.out.println(car4.model);
        System.out.println(car4.color);
        System.out.println(car4.maxSpeed);


    }
}
