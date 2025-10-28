import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int BASE_PRICE = 10000;
        int age;
        String timeType;
        double discount = 0.0;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.print("관람 시간(조조/일반)을 입력하세요: ");
        timeType = keyboard.nextLine();

        if (age >= 65) {
            discount = 0.4;
        } else if (age >= 8 && age <= 18) {
            discount = 0.3;
        } else {
            discount = 0.0;
        }

        if (timeType.equals("조조")) {
            discount += 0.2;
        }

        double finalPrice = BASE_PRICE * (1 - discount);

        System.out.println("나이 : " + age);
        System.out.println("관람 시간 : " + timeType);
        System.out.println("총 할인율 : " + (int)(discount * 100) + "%");
        System.out.println("최종 요금 : " + (int)finalPrice + "원");

    }
}