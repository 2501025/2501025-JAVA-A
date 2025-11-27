public class Output {
    static void display(int first, int second, int result) {
        display();
        System.out.printf("두 정수 %d 와 %d 중 큰 수는 %d 입니다.\n", first, second, result);
    }

    private static void display() {
        System.out.println("*****************************");
    }
}
