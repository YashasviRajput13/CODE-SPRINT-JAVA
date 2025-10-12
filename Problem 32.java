//Generating a Diamond Pattern of Stars
import java.util.Scanner;
class Problem32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the diamond pattern: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=i; j<n; j++) {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=1; i--) { //for inverse triangle
            for(int j=n; j>i; j--) {
                System.out.print(" ");
            }
            for(int k=1; k<=(2*i-1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }   
}