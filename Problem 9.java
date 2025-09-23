//Finding the LCM of two numbers 

import java.util.Scanner;

class Problem9 {
  public static void main(String[] args) {
    int n1,n2;
    Scanner scn = new Scanner(System.in);

    System.out.print("Enter first number: ");
    n1 = scn.nextInt();

    System.out.print("Enter second number: ");
    n2 = scn.nextInt();

    int gcd = findGCD(n1, n2);
    int lcm = (n1 * n2) / gcd;

    System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
  }
    public static int findGCD(int a, int b) {
        if (b == 0) {
        return a;
        }
        return findGCD(b, a % b);
    }
}

