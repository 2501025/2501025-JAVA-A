import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String[] hakbun = {
                "1601007", "1601003", "1601013", "1601024", "1601096",
                "1601058", "1601110", "1601077", "1601085", "1601026"
        };

        String[] name = {
                "이대한", "홍길동", "한나라", "이순신", "김혜숙",
                "김현호", "나희영", "이동국", "박예림", "김동근"
        };

        int[] mid = new int[10];
        int[] fin = new int[10];
        int[] quiz = new int[10];
        int[] report = new int[10];
        int[] attend = new int[10];

        float[] simpleAvg = new float[10];
        float[] weightAvg = new float[10];

        boolean swapped = false;

        for (int i = 0; i < 10; ) {
            System.out.printf("%s님의 중간 점수 입력 : ", name[i]);
            mid[i] = keyboard.nextInt();
            System.out.printf("%s님의 기말 점수 입력 : ", name[i]);
            fin[i] = keyboard.nextInt();
            System.out.printf("%s님의 퀴즈 점수 입력 : ", name[i]);
            quiz[i] = keyboard.nextInt();
            System.out.printf("%s님의 과제 점수 입력 : ", name[i]);
            report[i] = keyboard.nextInt();
            System.out.printf("%s님의 출석 점수 입력 : ", name[i]);
            attend[i] = keyboard.nextInt();

            if (check(mid[i]) && check(fin[i]) && check(quiz[i]) &&
                    check(report[i]) && check(attend[i])) {
                i++;
            } else {
                System.out.println("ERROR : 0~100 사이로 입력하세요!");
                System.out.println();
            }
        }

        for (int i = 0; i < 10; i++) {
            simpleAvg[i] = (mid[i] + fin[i] + quiz[i] + report[i] + attend[i]) / 5.0f;

            weightAvg[i] =
                    mid[i] * 0.15f +
                            fin[i] * 0.15f +
                            quiz[i] * 0.10f +
                            report[i] * 0.40f +
                            attend[i] * 0.20f;
        }

        for (int i = 0; i < name.length - 1; i++) {
            swapped = false;

            for (int j = 0; j < name.length - 1 - i; j++) {
                if (weightAvg[j] < weightAvg[j + 1]) {

                    swap(hakbun, j);
                    swap(name, j);
                    swap(mid, j);
                    swap(fin, j);
                    swap(quiz, j);
                    swap(report, j);
                    swap(attend, j);

                    float tempF = simpleAvg[j];
                    simpleAvg[j] = simpleAvg[j + 1];
                    simpleAvg[j + 1] = tempF;

                    tempF = weightAvg[j];
                    weightAvg[j] = weightAvg[j + 1];
                    weightAvg[j + 1] = tempF;

                    swapped = true;
                }
            }
            if (!swapped) break;
        }

        System.out.println("****************************************");
        System.out.println("학번     이름   중간 기말 퀴즈 과제 출석  단순  가중");
        System.out.println("****************************************");

        for (int i = 0; i < 10; i++) {
            System.out.printf("%7s %4s %4d %4d %4d %4d %4d  %5.1f %5.2f\n",
                    hakbun[i], name[i], mid[i], fin[i], quiz[i], report[i], attend[i],
                    simpleAvg[i], weightAvg[i]);
        }

        System.out.println("****************************************");
    }

    public static boolean check(int score) {
        return (score >= 0 && score <= 100);
    }

    public static void swap(String[] arr, int i) {
        String temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;
    }

    public static void swap(int[] arr, int i) {
        int temp = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = temp;

    }
}