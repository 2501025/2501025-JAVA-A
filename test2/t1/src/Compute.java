public class Compute {

    public static void calcTotal(int[][] score, int[][] total, float[] avg) {
        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            for (int j = 0; j < 4; j++) sum += score[i][j];
            total[i][0] = sum;
            avg[i] = sum / 4f;
        }

        for (int i = 0; i < score.length; i++) {
            int rank = 1;
            for (int j = 0; j < score.length; j++) {
                if (total[j][0] > total[i][0]) rank++;
            }
            total[i][1] = rank;
        }
    }

    public static float calcClassAvg(float[] avg) {
        float sum = 0;
        for (float a : avg) sum += a;
        return sum / avg.length;
    }

    public static void calcSchoolRank(int[][][] total) {
        for (int c1 = 0; c1 < total.length; c1++) {
            for (int s1 = 0; s1 < total[c1].length; s1++) {

                int rank = 1;
                int myScore = total[c1][s1][0];

                for (int c2 = 0; c2 < total.length; c2++) {
                    for (int s2 = 0; s2 < total[c2].length; s2++) {
                        if (total[c2][s2][0] > myScore)
                            rank++;
                    }
                }
                total[c1][s1][2] = rank;
            }
        }
    }
}
