package HongongMethod;

public class Calculator {
    //Field <- 클래스의 구성요소 필드
    //Constructor <-- 클래스의 구성요소 생성자
    //Method <-- 구성요소 메소드

    void powerOn() {
        System.out.println("전원을 켭니다.");  // 출력 메소드
        // 파워온이라는 실행결과가 없는(Void) 소드를 선언한거임
        // 파워온에는 외부로 받는 매개값이 없음 때문에 괄호가 비었음.
        // println도 첫글자 대문자로 하면 클래스인 줄 알고 작동 안해
         }
        int plus(int x, int y) {
            int result = x + y;   // 더하기 메소드
            return result;
        }
            // 결과값을 int로 받을 거니까 int로 타입 지정
            // 외부에서 값을 받아올 거니까 매개변수 int x, y 지정
            // 외부 값으로 덧셈을 진행할거니까 int result = x + y; 해줘.
            // int 값 result가 plus의 결과값이다 뜻.
            // return result; 변수 붙여줌
            // return 이라는 키워드는 어떤 메소드가 실행하면서 이런 결과값을 얻었다
            // 호출한 쪽으로 돌려준다는 뜻임
            // 사람이 plus 메소드를 호출하면 전자계산기는 plus를 실행하여 result(결과값)을 돌려준다는 의미임.

            double divide(double x, double y) {
                double result = (double) x / (double)y;  // 나누기 메소드
                return result;
            }

            void PowerOff() {
            System.out.println("전원을 켭니다.");
             }
        }


