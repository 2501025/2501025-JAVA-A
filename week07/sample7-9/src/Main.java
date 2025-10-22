import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        int height;
        int weight;
        char gender;
        float standard;
        float standard1;
        String result1, result2, result3;
        float percent, kilo;

        System.out.print("성별 (남 = 1,여 = 2) 입력 : ");
        gender = keyboard.next().charAt(0);

        System.out.print("당신의 키 입력 : ");
        height = keyboard.nextInt();

        System.out.print("몸무게 입력 : ");
        weight = keyboard.nextInt();

        if (gender == '1' || gender == '2') {
            if (gender == '1') {
                standard = (height - 100) * 0.9f;
            } else {
                standard = (height - 100) * 0.85f;
            }
            int temp = (int) standard * 100;
            if (temp % 10 != 0) {
                temp = (int) (temp / 100.0f + 0.1f);
            } else {
                temp = (int) (temp / 100.0f);
            }

            standard1 = temp;

            kilo = weight - standard;
            int temp1 = (int) (kilo * 100);
            kilo = temp1 / 100.0f;
            System.out.println("Jkilo = " + kilo);
            percent = kilo / 100.0f;
            result3 = weight > standard ? "필요합니다" : "필요하지 않습니다";
            if (percent <= -10.0f) {
                result1 = "저체중";
            } else if (percent < 20.0f) {
                result1 = "정상";
            } else if (percent <= 29.0f ) {
                result1 = "경도 비만";
            } else if (percent <= 49.0f) {
                result1 = "중증도 비만";
            } else {
                result1 = "고도 비만";
            }

            if (percent > 0.0f) {
                result2 = "초과";
            } else {
                result2 = "미달";
            }

            System.out.printf("키가 %dCm인 남자의 표준체중은 %.1f kg 입니다.\n", height, standard);
            System.out.printf("당신은 %s으로 표준체중보다 %.1f %% (%.1f 1Kg) %s 입니다.\n", result1, percent, kilo, result2);
            System.out.printf("당신은 다이어트가 %s.\n", result3);
        } else {
            System.err.println("ERROR : 성별이 의심스럽습니다.");
        }
    }
}