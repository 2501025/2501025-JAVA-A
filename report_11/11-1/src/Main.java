import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        final int BASIC_FEE = 1200;
        final int MAX_DATA = 10;

        int[] waterPrice = {0, 40, 55, 78, 35, 20};

        double[] taxRate = {0, 5.0, 3.5, 2.5, 1.5, 0.0};

        String[] typeName = {"", "가정용", "영업용", "공장용", "관공서", "군기관"};

        String[] number = new String[MAX_DATA];
        String[] name = new String[MAX_DATA];
        int[] code = new int[MAX_DATA];
        double[] usage = new double[MAX_DATA];
        int[] usageAmount = new int[MAX_DATA];
        int[] tax = new int[MAX_DATA];
        int[] total = new int[MAX_DATA];
        String[] remark = new String[MAX_DATA];

        int count = 0;

        for (int i = 0; i < MAX_DATA; i++) {
            System.out.print("사용자 번호(4자리, 종료는 0000): ");
            String num = keyboard.next();

            if (num.equals("0000")) break;

            number[count] = num;

            System.out.print("이름: ");
            name[count] = keyboard.next();

            System.out.print("수도 구분 코드(1~5): ");
            code[count] = keyboard.nextInt();

            System.out.print("사용량(m³): ");
            usage[count] = keyboard.nextDouble();

            int useInt = (int) usage[count];

            usageAmount[count] = useInt * waterPrice[code[count]];

            double tempTax = (BASIC_FEE + usageAmount[count]) * (taxRate[code[count]] / 100.0);

            tax[count] = (int) (tempTax / 10) * 10;

            total[count] = BASIC_FEE + usageAmount[count] + tax[count];

            if (code[count] == 5) {
                remark[count] = "일괄징수";
            } else {
                remark[count] = "";
            }

            count++;
        }

        System.out.println("                      수   도   요   금");
        System.out.println("--------------------------------------------------------------");
        System.out.println("번호   이름     구분     사용량   사용금액     TAX     납부액      비고");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < count; i++) {
            System.out.printf("%-6s %-6s %-6s %7.1f %,10d %,8d %,10d    %s\n",
                    number[i], name[i], typeName[code[i]], usage[i],
                    usageAmount[i], tax[i], total[i], remark[i]);
        }
    }
}