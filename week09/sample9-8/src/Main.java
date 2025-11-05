import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int TURTLE = (35 * 1000) / (60 * 60);
        final int RABBIT = (60 * 1000) / (60 * 60);
        int turtle = 450;
        int rabbit = 0;


        int i = 1;
        for (; true; i++) {
            turtle += TURTLE;
            rabbit += RABBIT;

            if (rabbit > turtle)
                break;
            System.out.printf("%d초 후 거북이 : %,d m이고, 토끼 : %,d m\n", i, turtle, rabbit);
        }
        System.out.printf("%d초 후 거북이 : %,d m이고, 토끼 : %,d m\n", i, turtle, rabbit);
    }
}