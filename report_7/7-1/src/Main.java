import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int a, b, c;
        int max, mid, min;

        System.out.print("3개의 정수를 입력하세요 : ");
        a = keyboard.nextInt();
        b = keyboard.nextInt();
        c = keyboard.nextInt();

        if (a >= b && a >= c) {
            max = a;
            if (b >= c) {
                mid = b;
                min = c;
            } else {
                mid = c;
                min = b;
            }
        } else if (b >= a && b >= c) {
            max = b;
            if (a >= c) {
                mid = a;
                min = c;
            } else {
                mid = c;
                min = a;
            }
        } else {
            max = c;
            if (a >= b) {
                mid = a;
                min = b;
            } else {
                mid = b;
                min = a;
            }
        }

        System.out.println("입력받은 수 : " + a + ", " + b + ", " + c);
        System.out.println("크기순으로 나열하면 " + min + ", " + mid + ", " + max + " 입니다.");

    }
}