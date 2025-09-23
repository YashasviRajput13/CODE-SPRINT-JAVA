// Find Factorial for n natural number

import java.util.*;
class solution2 {
    public static int findFactorial(int n){
        int factorial = 1;
        for(int i=1; i<=n; i++){
            factorial *= i;
        }
        return factorial;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = findFactorial(n);
        System.out.println("The factorial of " + n + " is: " + result);
        sc.close();
    }
}
