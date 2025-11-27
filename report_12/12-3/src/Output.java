public class Output {
    static void display(long money, String hangul) {
        display();
        System.out.printf("%,d는 %s 입니다.\n", money, hangul);
    }

    private static void display() {
        System.out.println("**************************");
    }
}