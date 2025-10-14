//Generating a Matrix with Multiplication Table
import java.util.Scanner;
class Problem33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                System.out.print(i * j + "\t"); // Using tab for better spacing
            }
            System.out.println();
        }
        sc.close();
    }   
}
