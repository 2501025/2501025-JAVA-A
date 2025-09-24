//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = -a;

        int c = a++ + 5 + --b;
        //c = a + 5;    10
        //c a + a + 1;    6
        int d = ++a + 6 - ++b;

        float e = (float) a / c;

        int f = 9 % 4; // 1
        int g = -9 % 4; // -1
        float h = -9.2f % 4; // -1.2f

        a += 5 * c;  //a = a + (5 * c);  //27

        System.out.printf("a = %d, b = %d, c = %d, d = %d, e = %.2f, f = %d, g = %d, h = %.2f\n", a, b, c, d, e, f, g, h);




    }
}