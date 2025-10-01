//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {

        boolean test = ((5 > 3) && (6 < 4));  //true &&(*) false -> false
        boolean test1 = ((5 < 3) && (6 < 4));  //false &&(*) ? -> false  Short-circuit-evaluation (단축연산)
        boolean test2 = ((5 > 3) || (6 < 4));  //true ||(+) ? -> true
        boolean test3 = ((5 < 3) || (6 < 4));  //false ||(+) false -> false  Short-circuit-evaluation (단축연산)

        boolean test4 = ((5 > 3) & (6 < 4));  //true &(*) false -> false
        boolean test5 = ((5 < 3) & (6 < 4));  //false &(*) false -> false
        boolean test6 = ((5 > 3) | (6 < 4));  //true |(+) false -> true
        boolean test7 = ((5 < 3) | (6 < 4));  //false |(+) false -> false

        boolean test8 = ((('A' + 1) > 'c') && (('b' - 1) != 'a'));  //false && ? -> false


        System.out.println(test);
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
        System.out.println(test8);
    }
}