import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int UNIT_PRICE = 56000;

        System.out.print("평수를 입력하세요: ");
        int p = keyboard.nextInt();

        int price = p * UNIT_PRICE;

        price = (price / 1000) * 1000;

        // 결과 출력
        System.out.printf("주택의 가격은 %,d원 입니다.\n", price);

    }
}