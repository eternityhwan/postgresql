package methodtest;

public class StudentArray {
    // 학생 30명 평균 점수 구하기
    // for는 30명 분만 돌리면 됨.
    // 총점과 평균 구해봐 -- 합과 평균을 구하려면 포문을 써라.
    // String[] names = null; // 스트링타입의 변수 네임을 선언 - null로 초기화
    // names = new String[] { "" "" ""} // names 라는 변수에 new 연산자로 스트링 배열 언급해주고 목록을 주면 초기화함.

    public static void main(String[] args) {
        int[] nomukun = {90, 95, 87, 93, 96};
        int[] presimoon = {10, 20, 30, 30, 40};
        int[] disastermoon = {20, 30, 40, 50, 60};


        // 노무군의 합과 평균균
        int sum = 0; // 합을 저장할 sum 변수 선언
        for (int i = 0; i < 5; i++) {
            sum += nomukun[i];  // +=은 누적시키겠다는거.
        }
        int sum2 = 0; // 합을 저장할 sum 변수 선언
        for (int i = 0; i < 5; i++) {
            sum += presimoon[i];  // +=은 누적시키겠다는거.
        }
            int sum3 = 0; // 합을 저장할 sum 변수 선언
            for (int i = 0; i < 5; i++) {
                sum += disastermoon[i];  // +=은 누적시키겠다는거.
            }
            System.out.println("nomukun 총점" + sum);
            System.out.println("presimoon 총점" + sum2);
            System.out.println("disastermoon 총점" + sum3);
            double avg1 = (double) sum / 5; // 더블 타입 변수 avg 선언 후 소숫점이 나오게 하려고 double로 변환
            double avg2 = (double) sum2 / 5;
            double avg3 = (double) sum3 / 5;
            System.out.println("nomukun 평균" + avg1);
            System.out.println("presimoon 평균" + avg2);
            System.out.println("disastermoon 평균" + avg3);
        }
    }


        // add 메소드를 쓸것잇다. add를 호출하면 얘가 발동해서 결과값을 산출함
//        public static int add ( int[] nomukun){
//            int sum = 0;
//            for (int i = 0; i < 5; i++) {
//                sum += nomukun[i];
//            }
//            return sum;





