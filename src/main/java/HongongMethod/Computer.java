package HongongMethod;

public class Computer {
    // Field
    // Constructor
    // Method
    // sum1 메소드를 만들고자함 - 매개값의 수와 상관없이 매개값을 다 더해야하는 메소드임
    // 몇개의 매개값을 받을지 정해지지 않았기 때문에 배열로 선언

    int sum1(int[] values) { // 다 더해도 인트값이 결과로 나올테니 int sum1로 저장
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i]; // <- 반복하며 누적해야하니 += 붙여줌
        }
        return sum;  // <- sum1은 모든 배열의 값을 더해서 sum에 리턴해줌,
    }

    // sum1, sum2 차이
    // sum1 배열 변수를 매개타입으로 제공하느냐
    // sum2 .을 구성된 매개변수를 제공하느냐의 차이임.

    int sum2(int ... values) { //  values 로 저장하면 자바는 배열로 인식함
        int sum = 0;
        for (int i = 0; i < values.length; i++) {
            sum += values[i];
        }
        return sum;
    }

}

