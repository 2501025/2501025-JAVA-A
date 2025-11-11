//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int WELL_DEPTH = 300;
        final int UP = 55;
        final int DOWN = 13;
        final int MAX_DAYS = 7;

        int height = 0;
        int day = 0;

        while (day < MAX_DAYS) {
            day++;

            height += UP;
            System.out.printf("%d일차 낮: %d cm 까지 올라감\n", day, height);

            if (height >= WELL_DEPTH) {
                System.out.println("달팽이가 방울꽃이 시들기 전에 우물에서 탈출했습니다");
                return;
            }

            height -= DOWN;
            System.out.printf("%d일차 밤: %d cm 까지 미끄러짐\n", day, height);
        }
        System.out.println("달팽이는 일주일 안에 우물에서 탈출하지 못했습니다.");
    }
}