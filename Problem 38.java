//Finding the Sum of Numbers in a String

import java.util.Scanner;

class Problem38 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string containing numbers: ");
        String input = sc.nextLine();

        int sum = 0;
        String number = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isDigit(ch)) {
                number += ch; // build the number string
            } else {
                if (!number.isEmpty()) {
                    sum += Integer.parseInt(number); // convert to integer and add to sum
                    number = ""; // reset number string
                }
            }
        }

        // To add the last number if the string ends with a digit
        if (!number.isEmpty()) {
            sum += Integer.parseInt(number);
        }

        System.out.println("The sum of numbers in the string is: " + sum);
        sc.close();
    }
}