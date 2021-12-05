package HongongInstancemember;

public class CarActionClass {

    public static void main(String[] args) {
        // 패키지 내에 미리 선언한 클래스 필드, 생성자 메소드 가져올거임
        Car science5ho = new Car("K5");
        Car yourcar = new Car("노무쿤");
        // 요렇게 써주면 패키지 내 생성자에 선언한
        // Car(String model) 값에 "K5"가 저장됨
        // this.model = model; 이 문장에서 매개변수 model에 K5가 저장된 후
        // this.model <- 필드값 model 변수에 저장이 되는 형태로 진행된다

        science5ho.run(); // Car 에 선언한 method가 작동됨
        yourcar.run();
    }
}
