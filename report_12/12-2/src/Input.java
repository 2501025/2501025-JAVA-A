import java.util.Scanner;

public class Input {
    static int readData(String s) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print(s);
        return keyboard.nextInt();
    }
}