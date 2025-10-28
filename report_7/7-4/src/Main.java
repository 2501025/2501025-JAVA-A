import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int kor, eng, math;
        double avg;
        String grade, result;

        System.out.print("국어, 영어, 수학 점수는 ? ");
        kor = keyboard.nextInt();
        eng = keyboard.nextInt();
        math = keyboard.nextInt();

        avg = (kor + eng + math) / 3.0;

        if (avg >= 90) {
            grade = "A";
        } else if (avg >= 80) {
            grade = "B";
        } else if (avg >= 70) {
            grade = "C";
        } else if (avg >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        if (avg >= 80) {
            result = "성적 양호";
        } else if (avg >= 60) {
            result = "노력";
        } else {
            result = "성적 불량";
        }

        System.out.println(" 국어  영어  수학  평균   학점   결과");
        System.out.printf(" %3d  %3d  %3d  %.2f   %s   %s\n", kor, eng, math, avg, grade, result);

    }
}