package HongongInstancemember;

public class Car {
    // Field
    String model; // 인스턴스 필드가 됨 객체가 있어야만 사용할 수 있어.
    int speed;    // 얘도 마찬가지

    // Constructor
    Car(String model) {
        this.model = model; // model = model 이래쓰면둘 다 매개변수 model로 인식임.
                            // 매개변수값을 매개변수에 저장하라는 뜻이됨
                            // 필드값 model로 써주고 싶다면 this.을 붙여줘
    }

    // Method
    void setSpeed(int speed) {
        this.speed = speed; // speed=speed 이렇게 쓰면 안됨
    }

    void  run() {
        for (int i = 0; i <=50; i+=10) {
            // i는 50 이하가 될 때까지 반복
            // 한 번 반복할 때마다 i는 10씩 증가해라임
            setSpeed(i);
            //this.setSpeed(i); this 객체가 가지고 있는 객체로 써줘도 됨.
            // 어차피 객체 소속이라 이래 써줘도 되는거
            System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h");
            // 모델 필드에 것을 가져오면됨.
        }
    }
}
