import java.io.IOException;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        Scanner keyboard = new Scanner(System.in);

        String name;
        int kor, eng, math;
        int total;
        float avg;
        String check;

        System.out.print("당신의 이름은? : ");
        name = keyboard.nextLine();


        while (true) {
            System.out.printf("%s 님의 국어 성적 입력 : ", name);
            kor = keyboard.nextInt();
            System.out.printf("%s 님의 영어 성적 입력 : ", name);
            eng = keyboard.nextInt();
            System.out.printf("%s 님의 수학 성적 입력 : ", name);
            math = keyboard.nextInt();

            if ((kor >= 0 && kor <= 100) && (eng >= 0 && eng <= 100) && (math >= 0 && math <= 100)) {
                break;
            } else {
                System.err.println("ERROR : 0 ~ 100");
                System.in.read();
            }
        }

        total = kor + eng + math;
        avg = total / 3.0f;
        if (avg >= 70.0f) {
            check = "합격";
        } else {
            check = "불합격";
        }

        check = avg >= 70.0f ? "합격" : "불합격";

        System.out.printf(">>> %s님의 성적표 <<<\n", name);
        System.out.printf("\t 국어 : %d 점\n", kor);
        System.out.printf("\t 영어 : %d 점\n", eng);
        System.out.printf("\t 수학 : %d 점\n\n", math);
        System.out.printf("\t 총점 : %d 점\n", total);
        System.out.printf("\t 평균 : %.2f 점\n", avg);
        System.out.printf("\t 판정 : %s 점\n", check);
    }
}