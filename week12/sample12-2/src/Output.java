public class Output {
    //Method Overload (중복 정의)
    public static void display(int temp, float result) {
        display("*");
        System.out.printf("섭씨온도 %d\u2103 -> 화씨온도 %.1f\u2109\n",temp, result);
        display("+");

    }

    private static void display(String s) {
        for (int i = 0; i < 30; i++)
            System.out.print(s);
        System.out.println();
    }
}
