package method.exercise;

public class FiveStudents {
    public static void main(String[] args) {
        int[][] students = {
                {100, 99, 98},
                {99, 98, 97},
                {98, 98, 97},
                {97, 98, 97},
                {96, 98, 97},
        };

        for (int[] student : students) {
            System.out.println(String.format("국어:%d 영어:%d 수학:%d", student[0], student[1], student[2]));
        }
    }
}
