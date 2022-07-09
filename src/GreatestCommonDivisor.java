public class GreatestCommonDivisor {
    /**
     * Find the Greatest Common Divisor of 2 number.
     *
     * @param a int inputed.
     * @param b int inputed.
     * @return int is Greatest Common Divisor of 2 number.
     */
    public int gcd(int a, int b) {
        if (a < 0) {
            a = a * (-1);
        }
        if (b < 0) {
            b = b * (-1);
        }
        int g = 1;
        for (int i = 2; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                g = i;
            }
        }
        return g;
    }
}
