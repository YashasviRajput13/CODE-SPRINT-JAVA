//Finding the Sum of the First N Odd Numbers

// class Problem35 {
//     public static void main(String[] args) {
//         int N = 5; 
//         int sum = 0;
//         for (int i = 0; i < N; i++) {
//             sum += (2 * i + 1); //2*i + 1
//         }
//         System.out.println("The sum of the first " + N + " odd numbers is: " + sum);
//     }
// }
import java.util.Scanner;
class Problem35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        int sum = 0;
        int num = 1;  // first odd number

        for (int i = 1; i <= n; i++) {
            sum = sum + num;
            num = num + 2;  // next odd number
        }
sc.close();
        System.out.println("Sum of first " + n + " odd numbers is: " + sum);
    }
}
