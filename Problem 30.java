//Generating a Multiplication Table for a Range

import java.util.Scanner;

    class Problem30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        System.out.print("Enter the range for the multiplication table: ");
        int range = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            System.out.println("Multiplication Table for " + i + ":");
            for (int j = 1; j <= range; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }

        scanner.close();
    }
}

