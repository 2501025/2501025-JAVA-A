import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("주유할 리터 수를 입력하세요: ");
        double liters = keyboard.nextDouble();

        System.out.print("리터당 가격을 입력하세요: ");
        double pricePerLiter = keyboard.nextDouble();

        double total = liters * pricePerLiter;

        if (total >= 50000) {
            total = total * 0.93;
        }

        double vat = total * 0.10;
        double finalPrice = total + vat;

        System.out.printf("할인 및 부가세 포함 최종 금액: %.0f원\n", finalPrice);

    }
}