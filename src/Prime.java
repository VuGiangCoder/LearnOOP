public class Prime {
    /**
     * Find is a Number Prime.
     *
     * @param n int.
     * @return true if it is a Prime.
     * false if it not a Prime.
     */
    public boolean isPrime(int n) {
        if (n < 2) {
            return false;
        } else if (n == 2 || n == 3) {
            return true;
        } else {
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
