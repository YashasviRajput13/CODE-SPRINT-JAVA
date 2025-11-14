//Calculating the Sum of the First N Fibonacci Numbers
import java.util.Scanner;
 
class Problem42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();
        int sum = 0;
        int a = 0;
        int b = 1;
        for (int i = 1; i <= n; i++) {
            sum += a;
            int next = a + b;
            a = b;
            b = next;
        }
        scanner.close();
        System.out.println("The sum of the first " + n + " Fibonacci numbers is: " + sum);
    }
}
