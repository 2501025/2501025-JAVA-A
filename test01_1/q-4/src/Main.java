import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        final float PI = 3.141592f;

        System.out.print("구의 반지름을 입력하세요(정수): ");
        int radius = keyboard.nextInt();

        double volume = (4.0 / 3.0) * PI * Math.pow(radius, 3);
        double surfaceArea = 4 * PI * Math.pow(radius, 2);

        System.out.printf("반지름이 %d인 구의 부피는 %.2f입니다.\n", radius, volume);
        System.out.printf("반지름이 %d인 구의 표면적은 %.2f입니다.\n", radius, surfaceArea);
    }
}