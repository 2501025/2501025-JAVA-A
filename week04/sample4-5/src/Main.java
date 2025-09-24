import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int base;  // data
        int height;  // data
        float area;  // 정보

        System.out.print("삼각형의 밑변 입력(Cm) : ");
        base = keyboard.nextInt();
        System.out.print("삼각형의 높이 입력(Cm) : ");
        height = keyboard.nextInt();

        area = (base * height) / 2.0f;

        System.out.println(">>>> 삼각형의 면적 <<<<");
        System.out.printf("\t밑변 : %,d Cm\n", base);
        System.out.printf("\t높이 : %,d Cm\n", height);
        System.out.printf("\t면적 : %,.2f \u33a0\n", area);

    }
}