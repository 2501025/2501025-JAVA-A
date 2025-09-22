import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("학교를 입력하세요: ");
        String school = keyboard.nextLine();

        System.out.print("이름을 입력하세요: ");
        String name = keyboard.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = keyboard.nextInt();

        System.out.print("성별(한 글자) 입력하세요: ");
        char gender = keyboard.next().charAt(0);

        System.out.print("신장을 입력하세요: ");
        double height = keyboard.nextDouble();

        System.out.print("체중을 입력하세요: ");
        double weight = keyboard.nextDouble();

        System.out.printf("******************");
        System.out.printf("학교 : " + school);
        System.out.printf("이름 : " + name);
        System.out.printf("나이 : " + age);
        System.out.printf("성별 : " + gender);
        System.out.printf("신장 : " + height + " Cm");
        System.out.printf("체중 : " + weight + " Kg");
        System.out.printf("******************");
    }
}