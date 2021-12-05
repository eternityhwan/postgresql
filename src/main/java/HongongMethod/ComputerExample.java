package HongongMethod;

public class ComputerExample {

    public static void main(String[] args) {

        Computer Aelianware = new Computer();

        int[] values1 = {1, 2, 3};

        Aelianware.sum1(values1); // <-- Aelianware  객체야 sum1 메소드 가져와서 써라.
        int result1 = Aelianware.sum1(values1);// 인트값으로 받아야하니 int result1을 써줌 int값으로 결과값 받고 그 값 받을 변수 result1
        System.out.println("result1:" + result1);

        // sum 1, 배열 객체를 매개값으로 제공해야함,
        // sum 2, 값의 목록으로 제공함.

       int result2 = Aelianware.sum1(new int[] {1, 2, 3, 4, 5});
        System.out.println("resule2:" + result2);

        int result3 = Aelianware.sum2(1,2,3); // 다 더해서 result 3에 저장
        System.out.println("resule3:" + result3);

        int result4 = Aelianware.sum2(1,2, 3,4,5); // 다 더해서 result 3에 저장
        System.out.println("resule4:" + result4);
    }
}
