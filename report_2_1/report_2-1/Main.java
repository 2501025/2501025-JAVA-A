import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int age = 0;
        double weight = 0;
        double height = 0;

        System.out.print("나이, 체중, 신장을 빈칸으로 분리하여 순서대로 입력하세요");
        age = keyboard.nextInt();
        weight = keyboard.nextDouble();
        height = keyboard.nextDouble();

        System.out.printf("당신의 나이는 %d살 입니다.\n", age);
        System.out.printf("당신의 체중은 %.1fkg 입니다.\n", weight);
        System.out.printf("당신의 신장은 %.1fcm 입니다.\n", height);
    }
}