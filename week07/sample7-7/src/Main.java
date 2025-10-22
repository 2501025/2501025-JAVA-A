import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int PAY = 11500;
        int hours;
        String result;
        int salary;
        int extraPay;

        System.out.print("주당 아르바이트 시간 입력 : ");
        hours = keyboard.nextInt();

        if (hours > 0) {
            if (hours >= 40) {
                salary = 40 * PAY;
                extraPay = (int) ((hours - 40) * (PAY * 1.5));
                result = String.format("수당 : %,d원과 급여 : %,d원, 합계 = %,d 원", extraPay, salary, extraPay + salary);
            } else {
                salary = hours * PAY;
                result = String.format("급여 : %d원", salary);
            }
            System.out.printf("시간당 임금 : %,d 원\n", PAY);
            System.out.printf("주당 %d 시간 아르바이트를 하면, %s\n", hours, result);
        } else {
            System.err.println("아르바이트 안했네");
        }



    }
}