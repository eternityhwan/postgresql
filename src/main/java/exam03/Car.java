package exam03;

public class Car {

    //필드 생성
    String company = "현대자동차";
    String model;
    String color;
    int maxSpeed;

    // 결정이 안된 세 개의 필드 값을 외부의 값으로 받아 초기화해줘야해
    // 생성자를 만들어줘야됨 -- 초기화 해줘야 하니까

    // 생성자 생성
    Car() {
        // 얘는 매개변수가 없이만드니까.
        // 기본값으로 초기화된 객체가 만들어짐
    }

    Car(String model) {
        this(model, null,0);
        // this.model 필드모델에 매개변수값 model을 대입한다는뜻
    }

    Car(String model, String color) {
        this(model, color, 0);
    }
    Car(String model, String color, int maxSpeed ) {
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
}
