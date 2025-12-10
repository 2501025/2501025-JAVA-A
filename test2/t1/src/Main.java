import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        String[][][] students = new String[3][][];
        students[0] = new String[][]{
                {"2101234", "홍길동", "남"}, {"2101235", "경복대", "여"},
                {"2101236", "한국인", "남"}, {"2101345", "정상인", "여"}
        };
        students[1] = new String[][]{
                {"2301345", "구자철", "남"}, {"2301435", "이가을", "여"},
                {"2301443", "김광현", "남"}, {"2301678", "박종철", "남"},
                {"2301679", "올시즌", "여"}
        };
        students[2] = new String[][]{
                {"2401234", "한민국", "여"}, {"2401456", "안우진", "남"},
                {"2401789", "이대한", "남"}
        };

        int[][][] score = new int[students.length][][];
        float[][] avg = new float[students.length][];

        for (int c = 0; c < students.length; c++) {
            score[c] = new int[students[c].length][4];
            avg[c] = new float[students[c].length];

            for (int s = 0; s < students[c].length; s++) {
                score[c][s] = Input.readScore(c + 1, students[c][s]);
            }
        }

        float[] classAvg = new float[students.length];
        int[][][] total = new int[students.length][][];

        for (int c = 0; c < students.length; c++) {
            total[c] = new int[students[c].length][3];
            Compute.calcTotal(score[c], total[c], avg[c]);
            classAvg[c] = Compute.calcClassAvg(avg[c]);
        }

        Compute.calcSchoolRank(total);

        Output.display(students, score, avg, total, classAvg);

    }
}