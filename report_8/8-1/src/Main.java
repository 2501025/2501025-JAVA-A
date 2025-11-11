//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int total_animals = 37;
        int total_legs = 102;
        int c, d;

        for (c = 0; c <= total_animals; ++c) {
            d = total_animals - c;
            if (2*c + 4*d == total_legs) {
                System.out.printf("닭 = %d마리, 개 = %d마리\n", c, d);
                break;
            }
        }
    }
}