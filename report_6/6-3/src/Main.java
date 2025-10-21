import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("나이를 입력하세요: ");
        int age = keyboard.nextInt();

        System.out.print("교통카드를 사용합니까? (Y/N): ");
        char card = keyboard.next().charAt(0);

        System.out.print("탑승 시간을 입력하세요 (0~23시): ");
        int hour = keyboard.nextInt();

        int fare = 0;

        if (age >= 20) {fare = (card == 'Y' || card == 'y') ? 1250 : 1350;}
        else if (age >= 13) {fare = (card == 'Y' || card == 'y') ? 750 : 850;}
        else {fare = 450;}

        if (hour >= 22 || hour <= 5) {fare *= 1.2;}

        System.out.printf("총 요금은 %.0f원입니다.%n", (double)fare);

    }
}