package HongongMethod;

public class Car4 {
    //Field

    int speed;

    // Constructor

    // Method
    int getspeed() {
        return speed;
    }

    void keyTurnOn() {
        System.out.println("키를 돌립니다.");
    }

    void run() {
        for (int i = 0; i <= 50; i += 10) { //  i가 한번 반볼 될때마다 10씩 늘어나라
            speed = i;
            System.out.println("달립니다.(시속:" + speed + "km/h");
        }
    }
}

