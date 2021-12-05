package HongongMethod;

public class Car3 {

    //Field
    int gas;

    //Constructor
    // 기본생성자 사용 결정

    //Method
    void seGas(int gas) { // 매개변수 int gas 를 넣음
        this.gas = gas;  // this는 Field 값임.
    }

    Boolean isLeftGas() { // 가스가 남아있으면 true 아니면 false
        if (gas == 0) {
            System.out.println("Gas가 없습니다");
            return false;
        } else {
            System.out.println("Gas가 있습니다.");
            return true;
        }
    }
        void run() {//외부로부터 받는 (매개변수값)값도 없다는뜻
            while (true) {
                if (gas > 0) {
                    System.out.println("달립니다.(Gas잔량:" + gas + ")");
                    gas -= -1;
                }else {
                    System.out.println("달립니다.(Gas잔량:" + gas + ")");
                    return;
                }
            }
        }
    }
