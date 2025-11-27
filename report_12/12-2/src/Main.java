//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int studentId;
        int year;
        boolean isLeap;

        studentId = Input.readData("학번 입력 : ");

        if (studentId % 2 == 0) {
            System.out.println("짝수 학번입니다. 윤년 판별 프로그램을 실행합니다.");
        } else {
            System.out.println("홀수 학번입니다. 윤년 판별 프로그램을 실행합니다.");
        }

        year = Input.readData("판별할 연도 입력 : ");

        isLeap = Compute.isLeapYear(year);

        Output.display(year, isLeap);

    }
}