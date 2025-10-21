import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("구매할 식권 장수를 입력하세요: ");
        int ticketCount = keyboard.nextInt();

        System.out.print("식권 1장의 가격을 입력하세요: ");
        int pricePerTicket = keyboard.nextInt();

        double discountRate = 0.0;

        if (ticketCount >= 30) {discountRate = 0.20;}
        else if (ticketCount >= 20) {discountRate = 0.15;}
        else if (ticketCount >= 10) {discountRate = 0.10;}

        double totalPrice = ticketCount * pricePerTicket;
        double discountedPrice = totalPrice * (1 - discountRate);

        System.out.printf("할인율: %.0f%%\n", discountRate * 100);
        System.out.printf("할인 전 금액: %.0f원\n", totalPrice);
        System.out.printf("할인 후 금액: %.0f원\n", discountedPrice);

    }
}