public class Output {
    static void display(int a, int b, int c, int d, int result) {
        display();
        System.out.printf("입력된 값: %d, %d, %d, %d\n", a, b, c, d);
        System.out.printf("가장 큰 수는 %d 입니다.\n", result);
    }

    private static void display() {
        System.out.println("***************************");
    }
}