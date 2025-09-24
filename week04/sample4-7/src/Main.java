import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        float height;
        float standard;

        System.out.print("당신의 키 입력 (170.1 Cm) : ");
        height = keyboard.nextFloat();

        standard = (float) ((height - 100) * 0.9);

        System.out.printf("키가 %.2f Cm인 사람의 표준 체중은 %.2f Kg 입니다.\n", height, standard);

    }
}