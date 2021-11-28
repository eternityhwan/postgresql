package methodtest;

public class Boolean {

    public static void main(String[] args) {

        boolean stop = false;
        // if문 괄호에는 조건을 넣음. ()조건이 true이면 중괄호 실행
        if (stop) {
            System.out.println("중지합니다");
        } else {
            System.out.println("시작합니다.");
        }
    }
}