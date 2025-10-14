//Finding the GCD of Multiple Numbers
import java.util.Scanner;
class Problem34 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int gcd = 1;
        int min;

        // find smallest among three numbers
        if (a < b && a < c)
            min = a;
        else if (b < c)
            min = b;
        else
            min = c;

        // check from 1 to min
        for (int i = 1; i <= min; i++) {
            if (a % i == 0 && b % i == 0 && c % i == 0) {
                gcd = i;
            }
            scn.close();
        }

        System.out.println("GCD of " + a + ", " + b + " and " + c + " is: " + gcd);
    }
}
