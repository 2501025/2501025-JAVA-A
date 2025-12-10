public class Output {

    public static void display(
            String[][][] students,
            int[][][] score,
            float[][] avg,
            int[][][] total,
            float[] classAvg
    ) {

        float schoolSum = 0;
        int schoolCount = 0;

        for (int c = 0; c < students.length; c++) {

            System.out.println("*** " + (c + 1) + "반 성적표 ***");
            System.out.println("*****************************************************************");
            System.out.println("학번     이름   국어 영어 수학 선택 총점 평균 반석차 학년석차   기타");
            System.out.println("*****************************************************************");

            for (int s = 0; s < students[c].length; s++) {

                schoolSum += avg[c][s];
                schoolCount++;

                String etc = (avg[c][s] < classAvg[c]) ? "반평균 미만" : "";

                System.out.printf("%s  %s  %3d  %3d  %3d  %3d  %3d  %6.2f  %3d    %3d  %s\n",
                        students[c][s][0], students[c][s][1],
                        score[c][s][0], score[c][s][1], score[c][s][2], score[c][s][3],
                        total[c][s][0], avg[c][s], total[c][s][1], total[c][s][2], etc
                );
            }
            System.out.println("*****************************************************************");
            System.out.printf("%d반 전체 평균: %.2f\n", c + 1, classAvg[c]);
        }
        System.out.printf("\n학년 전체 평균: %.2f\n", schoolSum / schoolCount);
    }
}
