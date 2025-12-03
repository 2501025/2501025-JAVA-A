//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {






        System.out.println(sumNumbers(1, 3, 5));
        System.out.println(sumNumbers(1, 3, 5, 9, 20, 45));
        System.out.println(sumNumbers(1, 3));

    }

    private static int sumNumbers(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            total += numbers[i];
        }

    return  total;
    }
}