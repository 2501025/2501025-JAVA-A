import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);


        System.out.print("원의 반지름 : ");

        int radius = keyboard.nextInt();

        double boxArea = (radius * 2) * (radius * 2);
        double circleArea = radius * radius * Math.PI;
        double area = boxArea - circleArea;


        System.out.printf("정사각형 면적 : %.2f cm2\n", boxArea);
        System.out.printf("원의 면적 : %.2f cm2\n", circleArea);
        System.out.printf("구하는 면적: %.2f cm2\n", area);

    }
}