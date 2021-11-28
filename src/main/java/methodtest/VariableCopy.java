package methodtest;

public class VariableCopy {
    public static void main(String[] args) {


        int x = 10; // x 변수에 10을 저장
        int y = 5; // x 변수에 저장된 값을 변수 y에 복사        // x에 저장된 값을 y에 넘기고 y 값을 x로 바꾸려면? 즉 x값과 y값을 교환.
        // temp 변수를 선언한 후 x 값 저장 후, x값을 y에 저장 y
        System.out.println(x);
        System.out.println(y);

        int temp = x;
        x = y;
        y = temp;

        // x의 값과 y의 값이 바뀌게 됨.

        System.out.println("x변수=" + x);
        System.out.println("y변수=" + y);

    }
}
