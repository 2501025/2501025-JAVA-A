public class Compute {
    static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    static int max4(int a, int b, int c, int d) {
        int max1 = max(a, b);
        int max2 = max(c, d);
        return max(max1, max2);
    }
}