//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int n1, n2, n3, n4;
        int result;

        n1 = Input.readData("첫 번째 정수 입력 : ");
        n2 = Input.readData("두 번째 정수 입력 : ");
        n3 = Input.readData("세 번째 정수 입력 : ");
        n4 = Input.readData("네 번째 정수 입력 : ");

        result = Compute.max4(n1, n2, n3, n4);
        Output.display(n1, n2, n3, n4, result);
    }
}