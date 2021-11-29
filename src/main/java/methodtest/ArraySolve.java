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
    int hap = 0;

    for (int i = 0; i < students.length; i++) {
        for (int j = 0; j < students[i].length; j++) {
            System.out.printf("students[%d][%d]=%d%n", i, j, students[i][j]);

           hap += students[i][j];
        }
    }
    System.out.println("sum=" + hap);
    }
}



