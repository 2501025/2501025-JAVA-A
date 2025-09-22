import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("첫번째 숫자를 입력하세요: ");
        int num1 = keyboard.nextInt();

        System.out.print("두번째 숫자를 입력하세요: ");
        int num2 = keyboard.nextInt();

        int sum = num1 + num2;

        System.out.printf(num1 + " + " + num2 + " = " + sum);

    }
}