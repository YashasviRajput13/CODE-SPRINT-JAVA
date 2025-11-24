//calculation binomial coefficient nCr using factorial method
 class Problem45{

    // Function to calculate factorial
    public static int factorial(int num) {
        int fact = 1;
        for(int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    // Function to calculate binomial coefficient nCr
    public static int binCoeff(int n, int r) {
        int n_fact = factorial(n);        // (a)
        int r_fact = factorial(r);        // (b)
        int n_r_fact = factorial(n - r);  // (c)

        int binCoeff = n_fact / (r_fact * n_r_fact);  // (d)
        return binCoeff;
    }

    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println("Binomial Coefficient nCr = " + binCoeff(n, r));
    }
}
