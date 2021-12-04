package Hongongjava;

public class Car {

        // psvm 이 있으면 안됨 얘는 그저 참조할 설계도에 불과함
        // 메인 메소드는 CarExample 클래스에서 사용된다.
        // Field
        // Constructor

        // CarExmple 에서 선언한 생성자 호출 코드에 맞게 매개변수를 써줘야해

        Car(String color, int cc) {

            System.out.println(color);
            System.out.println(cc);
            System.out.println(color + "색의" + cc + "cc 차가 생성됨.");
        }
        // 생성자를 명확하게 생성해주면 기본 생성자를 사용할 수 없어.
            // 선언한 생성자의 매개변수에 맞게 선언해줘야해
    }






