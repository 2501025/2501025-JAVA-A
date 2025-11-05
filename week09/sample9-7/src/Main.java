//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        float degree;

        /* for (int i = 0; i <= 100; i += 10) {
            degree = (5 / 9.0f) * (i - 32);

            System.out.printf("화씨온도 : %3d \u2109, 섭씨온도 : %6.2f \u2103\n", i, degree);
        } */

        int i = 0;

        do {
            degree = (5 / 9.0f) * (i - 32);

            System.out.printf("화씨온도 : %3d \u2109, 섭씨온도 : %6.2f \u2103\n", i, degree);
            i += 10;
        } while (i <= 100);
    }
}