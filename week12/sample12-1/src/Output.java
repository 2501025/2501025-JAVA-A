public class Output {
    // Method Overloading (중복 제외)

    static void display(int first, int second, int result) {
        display();
        System.out.printf("%d + %d = %d\n", first, second, result);
    }

    private static  void display() {
        System.out.println("*****************************************");
    }
}
