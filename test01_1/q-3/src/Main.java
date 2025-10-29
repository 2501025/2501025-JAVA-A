//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        final long PURCHASE_PRICE = 1015000;
        final double PROFIT_RATE = 30.0;
        final double TAX_RATE = 10.0;

        double sellingPrice = PURCHASE_PRICE * (1 + PROFIT_RATE / 100.0);
        double salesTax = sellingPrice * (TAX_RATE / 100.0);
        double purchaseTax = PURCHASE_PRICE * (TAX_RATE / 100.0);
        double payableTax = salesTax - purchaseTax;

        System.out.printf("매입원가 : %d\n", PURCHASE_PRICE);
        System.out.printf("관할 세무서에 납부할 세금액: %,.0f원\n", payableTax);
    }
}