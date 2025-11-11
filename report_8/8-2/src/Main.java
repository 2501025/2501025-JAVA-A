//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final int COIN_500 = 500;
        final int COIN_100 = 100;
        final int COUNT = 10;
        final int MONTHS = 12;
        final int YEARS = 30;

        int monthly = COIN_500 * COUNT + COIN_100 * COUNT;

        int yearly = monthly * MONTHS;

        int total = yearly * YEARS;

        System.out.printf("한 달 저금액: %,d원\n", monthly);
        System.out.printf("1년 저금액: %,d원\n", yearly);
        System.out.printf("30년 총 저금액: %,d원\n", total);

    }
}