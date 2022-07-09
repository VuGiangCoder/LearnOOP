public class Fibonancci {
    /**
     * Find nth Fibonancci.
     *
     * @param n is long.
     * @return nth Fibonancci.
     */
    public long fibonacci(long n) {
        long f0 = 0;
        long f1 = 1;
        long fn = 1;
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        if (fn >= 9223372036854775807L) {
            fn = Long.MAX_VALUE;
        }
        return fn;
    }
}
