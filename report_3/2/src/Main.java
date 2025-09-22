//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final String school = "경복대학교";
        final String name = "홍길동";
        final int age = 20;
        final char gender = '남';
        final double height = 170.6;
        final double weight = 65.4;

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