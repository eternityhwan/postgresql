package method.exercise;

public class WhatIsMethod {
    void sumScores(int koreanScore, int englishScore, int mathScore) {
        System.out.println(String.format("합계: %d", koreanScore + englishScore + mathScore));
    }

    public static void main(String[] args) {
        WhatIsMethod wim = new WhatIsMethod();
        wim.sumScores(100, 90, 95);
    }
}
