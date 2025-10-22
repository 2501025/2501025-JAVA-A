import java.lang.classfile.instruction.SwitchCase;
import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int score;
        char grade, plus = ' ';

        System.out.print("점수 입력 : ");
        score = keyboard.nextInt();

        if (score >= 0 && score <= 100) {
            int temp = score /10;
            switch (score / 10) {
                case 10 :
                    grade = 'A';
                    plus = '+';
                    break;
                case 9 :
                    grade = 'A';
                    break;
                case 8 :
                    grade = 'B';
                    break;
                case 7 :
                    grade = 'C';
                    break;
                case 6 :
                    grade = 'D';
                    break;
                default :
                    grade = 'F';
                    break;
            }

            if (temp == 9 || grade == 'B' || grade == 'C' || grade == 'D') {
                switch (score % 10) {
                    case 9:
                    case 8:
                    case 7:
                    case 6:
                    case 5:
                        plus = '+';
                        break;
                    default:
                        plus = ' ';
                }
            }
            System.out.printf("점수가 %d 이면, 학점은 %c%c 입니다.\n", score, grade, plus);
        } else {
            System.err.println("ERROR : 점수가 이상합니다.");
        }
    }
}