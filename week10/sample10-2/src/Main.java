import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String text;
        char[] convert;

        System.out.print("영 문자 입력 : ");
        text = keyboard.nextLine();

        convert = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) >= 'a' && text.charAt(i) <= 'z') {
                convert[i] = (char) (text.charAt(i) - 32);
            } else if (text.charAt(i) >= 'A' && text.charAt(i) <= 'Z') {
                convert[i] = (char) (text.charAt(i) + 32);
            } else {
                convert[i] = text.charAt(i);
            }
        }

        System.out.printf("원문 : %s\n", text);
        System.out.printf("변환 : %s\n", new String(convert));

    }
}