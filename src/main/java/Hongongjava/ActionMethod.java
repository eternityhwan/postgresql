package Hongongjava;

public class ActionMethod {

    public static void main(String[] args) {

        GetterAndSetter test = new GetterAndSetter();
        // 객체를 만들어서
        // 스피드의 값을 바꿔봄.

        test.setSpeed(60); // <- 위에 선언한 클래스에 값 저장.
        // 이렇게하면 위에 게터엔세터 클래스에 인트 값 speed에 60값이 저장됨
        System.out.println("현재속도:" + test.getSpeed());

        if(!test.isStop()) { // !을 붙여줘 움직이지 않다면 이라는 조건붙여줘
            test.setStop(true); // 움직이고 있을 때 중지해라
                // 정지가 되어있으면 0이 나와야함.
        }
        System.out.println("현재속도:" + test.getSpeed());

        // 세터에 값을 설정했고
        // 게터 메소드를 불러와서 값을 출력한다.
        // 세터는 값을 설정하고 게터는 값을 읽어옴.
    }
}
