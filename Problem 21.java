//Calculating the Sum of Digits of a Number Until Single Digit
import java.util.Scanner;
class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        int result = sumOfDigitsUntilSingleDigit(number);
        System.out.println("The single digit sum of the digits is: " + result);
        scanner.close();
    }

    public static int sumOfDigitsUntilSingleDigit(int n) {
        while (n >= 10) {
            n = sumOfDigits(n);
        }
        return n;
    }

    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}   