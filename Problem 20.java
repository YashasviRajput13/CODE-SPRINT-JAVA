//Finding All Divisors of a Number
import java.util.Scanner;

class Problem20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        System.out.println("Divisors of " + number + " are:");
        findDivisors(number);
        scanner.close();
    }

    public static void findDivisors(int n) {
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}   