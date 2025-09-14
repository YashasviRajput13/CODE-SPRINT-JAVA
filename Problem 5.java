//Given a number n, determine whether it is a prime number or not.
import java.util.Scanner;
    class Problem5 {
        static boolean isPrime(int n){
            if(n==1)
            return false;

            for(int i=2; i<n; i++)
            if(n%i==0)
            return false;
            return true;
            }
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter a number: ");
               int n = sc.nextInt();
               sc.close();
                if(isPrime(n)){
                 System.out.println(n + " is a prime number.");
                }
                else{
                 System.out.println(n + " is not a prime number.");
                }
            }
        }