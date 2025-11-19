//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        int[][] sales = {{2010, 11230, 12345, 21495, 21543, 0},
                {2011, 15230, 12375, 21895, 21643, 0},
                {2012, 17230, 32345, 26495, 26543, 0}};
        float[] avg = new float[sales.length];

        for (int i = 0; i < sales.length; i++) {
            for (int j = 1; j < sales[i].length - 1; j++) {
                sales[i][sales[i].length - 1] += sales[i][j];
            }
        }

        for (int i = 0; i < sales.length; i++) {
            avg[i] = sales[i][sales[i].length - 1] / 4.0f;
        }


        System.out.println("*********************************************************");
        System.out.println(" 년도    1분기    2분기    3분기    4분기     합계      평균");
        System.out.println("*********************************************************");

        for (int i = 0; i < sales.length; i++) {
            System.out.printf("%4d년 %,7d %,7d %,7d %,7d %,9d %,7.0f\n", sales[i][0],
                    sales[i][1], sales[i][2], sales[i][3], sales[i][4], sales[i][5], avg[i]);
        }
        System.out.println("*********************************************************");
    }
}