import java.util.Scanner;

public class Input {
    static long readLong(String s) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print(s);
        return keyboard.nextLong();
    }
}