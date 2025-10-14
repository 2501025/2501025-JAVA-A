import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("구매 금액을 입력하세요: ");
        int amount = keyboard.nextInt();

        System.out.print("멤버십 회원인가요? (true/false): ");
        boolean isMember = keyboard.nextBoolean();

        boolean freeShipping = (amount >= 50000) || (isMember && amount >= 30000);

        if (freeShipping) {
            System.out.println("무료배송이 적용됩니다.");
        } else {
            System.out.println("무료배송 대상이 아닙니다.");

        }
    }
}