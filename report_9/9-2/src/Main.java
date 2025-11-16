import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] score = new int[10];
        int total = 0;
        int max = -1;
        int min = 101;

        System.out.println("10개의 정수 데이터 입력");

        for (int i = 0; i < score.length; i++) {
            System.out.print((i + 1) + " : ");
            score[i] = keyboard.nextInt();

            total += score[i];

            if (score[i] > max) max = score[i];
            if (score[i] < min) min = score[i];
        }

        float average = total / 10.0f;

        System.out.println("==== 출력 결과 ====");
        System.out.println("합계 : " + total);
        System.out.println("평균 : " + average);
        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);

    }
}