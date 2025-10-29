import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.print("시간 입력 : ");
        double time = keyboard.nextDouble();

        int totalSeconds = (int)(time * 3600);

        int days = totalSeconds / (24 * 3600);
        int hours = (totalSeconds % (24 * 3600)) / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        System.out.printf("%.2f 시간은 %d일 %d시간 %d분 %d초 입니다.\n", time, days, hours, minutes, seconds);
    }
}