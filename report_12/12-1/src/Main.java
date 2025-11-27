//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int first, second;
        int result;

        first = Input.readData("첫 번째 정수 입력 : ");
        second = Input.readData("두 번째 정수 입력 : ");

        result = Compute.max(first, second);
        Output.display(first, second, result);

    }
}