//Finding the GCD of two numbers

class Problem7 {

    public long gcd(long a, long b) {
        if (a == 0)
            return b;
        return gcd(b % a, a);
    }

    public static void main(String[] args) {
        Problem7 obj = new Problem7();
        long a = 12;
        long b = 18;
        long result = obj.gcd(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}