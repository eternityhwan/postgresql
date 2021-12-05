package HongongConstructor;

public class GetterAndSetter {

    // 게터 - 필드 값을 외부로 리턴하는 메소드
    // 세터 - 외부값을 받아 필드값을 변경하는 메소드드

   // Field 선언
    private int speed;
    private boolean stop;

    // Method -- getter and setter는 자동완성 기능있음
    // 위에 생성한 speed, stop의 게터와 세터가 만들어짐.

    // 필드타입이 리턴타입이 됨.
    // 게터의 이름은 필드의 첫자를 대문자로 하여 생성됨.
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {// Void 리턴값이 없다는 뜻
        if (speed < 0) {
            this.speed = 0;  // 만약 스피드값이 0 이하로 내려가면 0으로 출력해
            return; // 더이상 진행못하니 여기서 끝내줌 - 50을 넣어도 0값이 출력됨
        } else {
            this.speed = speed;     // setter 도
        }
    }
    public boolean isStop() { // 불리언 필드의 게터는 is로 시작함
        return stop;            // 필드의 첫자를따서 만들어짐.
    }

    public void setStop(boolean stop) { // 필드와 동일한 타입의 불리언타입 받음.
        this.stop = stop;
//        if (stop) { // stop이 나왔으면 스피드를 0값으로 지정해라
            speed = 0;
        }
    }

