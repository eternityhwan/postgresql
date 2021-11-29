package methodtest;

public class ArraySolve {
    public static void main(String[] args) {

        int[][] students = {
                {100, 100, 100},
                {90, 90, 90},
                {80, 80, 80},
                {70, 70, 70},
                {60, 60, 60}
        };
        // 위 이차원 배열 합과 평균을 구할 것임.
        int hap = 0;
        int count=0;
        double avg = 0;

        for (int i = 0; i < students.length; i++) {
            for (int y = 0; y< students[y].length; y++) {
                hap += students[i][y];
                avg = hap / 3;
            }
        }
        System.out.println("합은" + hap);
        System.out.println("평균은" + avg);
    }
}


        //        for (int j = 0; j < students[i].length; j++) {
//            System.out.printf("students[%d]=%d%n", i, students[i]);
//           hap += students[i];
//        }
//    }
//    System.out.println("sum=" + hap);
//    }
//}



