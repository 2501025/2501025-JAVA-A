import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("달러(100) 개수를 입력하세요: ");
        int dollars = keyboard.nextInt();

        System.out.print("하프(50) 개수를 입력하세요: ");
        int halves = keyboard.nextInt();

        System.out.print("쿼터(25) 개수를 입력하세요: ");
        int quarters = keyboard.nextInt();

        System.out.print("다임(10) 개수를 입력하세요: ");
        int dimes = keyboard.nextInt();

        System.out.print("니켈(5) 개수를 입력하세요: ");
        int nickels = keyboard.nextInt();

        System.out.print("페니(1) 개수를 입력하세요: ");
        int pennies = keyboard.nextInt();

        int totalCents = dollars * 100 + halves * 50 + quarters * 25 + dimes * 10 + nickels * 5 + pennies;

        System.out.printf("총 금액: " + totalCents + " 센트");

    }
}