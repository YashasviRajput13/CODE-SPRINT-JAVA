// Printing Pascal's Triangle

import java.util.Scanner;

class Problem14 {
    public static void main(String[] args) {
        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int space = rows -1;
        int num = 1;
        for (int i = 0; i<rows; i++) {
            for (int s=1; s<=space; s++) {
                System.out.print("  ");
            }   
            num = 1;
            for (int j = 0; j<=i; j++) {
                System.out.print(num + "   ");
                num = num * (i - j) / (j + 1);
            }
            space--;
            System.out.println();   
        }
        sc.close();
    }
}
