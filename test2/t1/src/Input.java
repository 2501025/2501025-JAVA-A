import java.io.IOException;
import java.util.Scanner;

public class Input {

    static Scanner keyboard = new Scanner(System.in);

    public static int[] readScore(int classNum, String[] student) throws IOException {

        int[] score = new int[4];
        String name = student[1];
        String gender = student[2];
        String selectSubject = (gender.equals("남")) ? "기술" : "가정";

        String[] subject = {"국어", "영어", "수학", selectSubject};

        System.out.printf("*** %d반 성적 입력 ***\n", classNum);

        for (int i = 0; i < 4; i++) {

            while (true) {
                System.out.printf("%d반 학생 %s의 %s 점수 입력 : ",
                        classNum, name, subject[i]);

                int input = keyboard.nextInt();

                if (input >= 0 && input <= 100) {
                    score[i] = input;
                    break;
                } else {
                    System.err.println("ERROR");
                    System.in.read();
                }
            }
        }
        return score;
    }
}
