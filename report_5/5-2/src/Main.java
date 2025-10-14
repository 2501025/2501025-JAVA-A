import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("당신의 JAVA 점수 입력 : ");
        int score = keyboard.nextInt();

        String grade;

        if (score >= 95 && score <= 100) {
            grade = "A+";
        } else if (score >= 90) {
            grade = "A0";
        } else if (score >= 85) {
            grade = "B+";
        } else if (score >= 80) {
            grade = "B0";
        } else if (score >= 75) {
            grade = "C+";
        } else if (score >= 70) {
            grade = "C0";
        } else if (score >= 65) {
            grade = "D+";
        } else if (score >= 60) {
            grade = "D0";
        } else {
            grade = "F";
        }

        System.out.println("입력 점수 : " + score);
        System.out.println("학점 : " + grade);

    }
}