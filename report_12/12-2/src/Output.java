public class Output {
    static void display(int year, boolean isLeap) {
        display();

        if (isLeap) {
            System.out.printf("%d년은 윤년입니다.\n", year);
        } else {
            System.out.printf("%d년은 평년입니다.\n", year);
        }
    }

    private static void display() {
        System.out.println("***********************");
    }
}