package Codeup100;

import java.util.Scanner;

public class Pro78 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5 ''' 순서대로 계속 더해 합을 만들어가다가
        // 입력된 정수와 같거나 커졌을 때 마지막에 더한 정수를 출력한다.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i =1; i <= 1000; i++)
        {
            sum+=i;
            if(a<=sum) {// 작거나 같다고 해줘야 11이 안나옴.
                System.out.println(i);
                break;
            }
        }
    }
}
