import java.io.IOException;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) throws IOException {

        String[][] students = new String[][] {{"홍길동", "남", ""}, {"강민성", "남", ""},
                {"김소민", "여", ""}, {"박건준", "남", ""}, {"김시온", "여", ""}, {"박신혁", "남", ""},
                {"이예린", "여", ""}, {"니키타", "남", ""}, {"밀리나", "여", ""}, {"바토르", "남", ""}};

        int[] height = new int[students.length];
        float[][] weight = new float[students.length][3]; // {"체중", "표준체중", "bmi"}

        Input.readData(students, height);
        System.out.println();
        Input.readData(students, weight);

        Compute.standard(students, height, weight);
        Compute.bmi(weight);
        Compute.check(students, weight);

        Output.display(students, height, weight);

    }
}