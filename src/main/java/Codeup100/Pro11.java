package Codeup100;

import java.util.Scanner;

public class Pro11 {
    public static void main(String[] args) {
        float loa;

        Scanner nomu = new Scanner(System.in);

        loa = nomu.nextFloat();

//        float loa = 3.14f; // 메모리 효율적으로 쓰게 하기 위해서 f타입을 꼭 붙여주게 강제됨. d로 하면 느려짐

        System.out.printf("%f", loa); // <-- 출력 타입도 실수 타입으로 동일하게 맞춰줘야해.
    }
}
