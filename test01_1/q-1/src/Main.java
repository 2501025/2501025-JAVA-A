import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int age;
        int fee;

        System.out.print("나이를 입력하세요: ");
        age = keyboard.nextInt();
        fee = (age >= 18) ? 4000 : (age >= 13) ? 3000 : (age >= 7) ? 1000 : 0;

        System.out.printf("입장료는 %d 원입니다.\n", fee);
    }
}