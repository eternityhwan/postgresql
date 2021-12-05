package StaticInstanceWarning;

public class CAr {
    // 인스턴스 필드
    int speed;


    // 얘는 인스턴스 메소드임 스테틱이 없잖아
    void run() {
        System.out.println(speed + "으로 달립니다");
    }

    public static void main(String[] args) {
         // 여기 메인도 static 도 정적(static) 메소드임
         // speed = 60; // <  얘는 실행이 안됨 객체가 없는 인스턴스 변수니까.
         // run();
         // 대신 객체를 만들어서 사용 할 수 있어.
         CAr myCar = new CAr();
        myCar.speed = 60;
        myCar.run();
    }
}
