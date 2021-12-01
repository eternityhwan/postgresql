package Codeup100;

import java.util.Scanner;

public class Pro47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int nomu = sc.nextInt();
        int jane = sc.nextInt();

        System.out.printf("%d", nomu<<jane);
        //비트 시프트 노무<<제인 이렇게 쓰면
        // 노무의 제인승 이렇게 됨
        // 노무값을 2, 제인을 10으로 하게되면
        // 2의 10승이되는것임 값은 1024 이지.
    }
}
