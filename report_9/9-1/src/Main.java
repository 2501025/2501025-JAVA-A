import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int[] ip = new int[4];
        int invalid = 0;
        int total = 0;
        int vote;

        System.out.println("투표 번호를 입력하세요 (0 입력 시 종료):");

        while (true) {
            vote = keyboard.nextInt();

            if (vote == 0)
                break;

            total++;

            if (vote >= 1 && vote <= 4) {
                ip[vote - 1]++;
            } else {
                invalid++;
            }
        }

        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 후보 득표수: " + ip[i]);
        }

        System.out.println("무효표 수: \n" + invalid);
        System.out.println("총 투표수: \n" + total);

    }
}