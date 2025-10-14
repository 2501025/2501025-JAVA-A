import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        char ch = ' ';
        char convert = ' ';
        String result = "";
        String type = "";

        System.out.print("하나의 문자 입력 : ");
        ch = keyboard.next().charAt(0);

        result = ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) ? "영문자" : "영문자가 아닙니다";

        type = (ch >= 'A' && ch <= 'Z') ? "대문자"
                : (ch >= 'a' && ch <= 'z') ? "소문자"
                : "X";

        convert = (ch >= 'A' && ch <= 'Z') ? (char)(ch + 32)
                : (ch >= 'a' && ch <= 'z') ? (char)(ch - 32)
                : ch;

        if (type.equals("X")) {
            System.out.println("입력한 문자는 영문자가 아닙니다.");
        } else {
            System.out.printf("입력한 문자 %c는 %s(%s)입니다. 변환 결과: %c\n", ch, result, type, convert);
        }
    }
}