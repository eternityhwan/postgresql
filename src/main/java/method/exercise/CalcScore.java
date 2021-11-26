package method.exercise;

public class CalcScore {
    void sumScores(int koreanScore, int englishScore, int mathScore) {
        System.out.println(String.format("합계: %d", koreanScore + englishScore + mathScore));
    }

    int sumScoresReturn(int koreanScore, int englishScore, int mathScore) {
         return koreanScore + englishScore + mathScore;
    }

    public static void main(String[] args) {


        CalcScore wim = new CalcScore();
        wim.sumScores(100, 90, 95);
    }
}
