package HongongMethod;

public class Car4Example {

    public static void main(String[] args) {

        Car4 nomu = new Car4();

        nomu.keyTurnOn();
        nomu.run();
//        nomu.getspeed() -- 인트값을 이용하지 않는다 하면 요렇게 해도 나옴
        int speed = nomu.getspeed();
        System.out.println("현재속도:" + speed + "km/h");
    }
}
