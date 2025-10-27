//Finding All Divisors of the Product of Two Numbers
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Problem41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int product = num1 * num2;
        Set<Integer> divisors = new TreeSet<>();

        for (int i = 1; i <= Math.sqrt(product); i++) {
            if (product % i == 0) {
                divisors.add(i);
                divisors.add(product / i);
            }
        }

        System.out.println("Divisors of " + product + " are: " + divisors);
        sc.close();
    }
}
