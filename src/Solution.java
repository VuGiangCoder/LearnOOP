public class Solution {
    private int numerator;
    private int denominator;

    /**
     * Constructor 1.
     *
     * @param numerator   int.
     * @param denominator int default is 1.
     */
    public Solution(int numerator, int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /**
     * set Denominator for Fraction.
     *
     * @param denominator int not equal 0 and default = 1.
     */
    public void setDenominator(int denominator) {
        if (denominator == 0) {
            denominator = 1;
        }
        this.denominator = denominator;
    }

    /**
     * reduce Fraction method.
     *
     * @return this Solution after reduce.
     */
    public Solution reduce() {
        if (this.getNumerator() < 0) {
            this.setNumerator(this.getNumerator() * (-1));
        }
        if (this.getDenominator() < 0) {
            this.setDenominator(this.getDenominator() * (-1));
        }
        int g = 1;
        for (int i = 2; i <= this.getNumerator() && i <= this.getDenominator(); i++) {
            if (this.getNumerator() % i == 0 && this.getDenominator() % i == 0) {
                g = i;
            }
        }
        this.setNumerator(this.getNumerator() / g);
        this.setNumerator(this.getDenominator() / g);
        return this;
    }

    /**
     * Add Fraction by Fraction.
     *
     * @param newSolution Solution .
     * @return this Solution after adding.
     */
    public Solution add(Solution newSolution) {
        this.setNumerator(this.getNumerator() * newSolution.getDenominator()
                + this.getDenominator() * newSolution.getNumerator());
        this.setDenominator(this.getDenominator() * newSolution.getDenominator());
        return this;
    }

    /**
     * Subtract Fraction by Fraction.
     *
     * @param newSolution Solution.
     * @return this Solution after subtracting.
     */
    public Solution subtract(Solution newSolution) {
        this.setNumerator(this.getNumerator() * newSolution.getDenominator()
                - this.getDenominator() * newSolution.getNumerator());
        this.setDenominator(this.getDenominator() * newSolution.getDenominator());
        return this;
    }

    /**
     * Multiply Fraction by Fraction.
     *
     * @param newSolution Solution.
     * @return this Solution after multiplying.
     */
    public Solution multiply(Solution newSolution) {
        this.setNumerator(this.getNumerator() * newSolution.getNumerator());
        this.setDenominator(this.getDenominator() * newSolution.getDenominator());
        return this;
    }

    /**
     * Divide Fraction by Fraction.
     *
     * @param newSolution Solution.
     * @return this Solution after divide.
     */
    public Solution divide(Solution newSolution) {
        this.setNumerator(this.getNumerator() * newSolution.getDenominator());
        this.setDenominator(this.getDenominator() * newSolution.getNumerator());
        return this;
    }

    /**
     * Check if 2 fractions are equal.
     *
     * @param obj Object .
     * @return true if are equal.
     * false else.
     */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            other.reduce();
            Solution newSolution = new Solution(this.getNumerator(), this.getDenominator());
            newSolution.reduce();
            if (other.getNumerator() == newSolution.getNumerator()
                    && other.getDenominator() == newSolution.getDenominator()) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
