import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        String[] student = new String[] {"홍길동", "이순신", "임꺽정", "한민국", "이대한"};
        // int[][] score = new int[student.length][4];

        int[][] score = Input.readDate(student);

        Compute.total(score);

        Output.display(student, score);

    }
}