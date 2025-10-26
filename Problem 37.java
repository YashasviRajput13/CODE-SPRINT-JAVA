//Finding the Number of Perfect Numbers Up to a Given Limit

import java.util.Scanner;

class problem37 {
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();

        System.out.println("Perfect numbers up to " + limit + " are:");
        for(int i = 1; i <= limit; i++) {
            int sum = 0;
           //Why only till n/2? Because no number greater than n/2 (except n itself) can divide n evenly.
           for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    sum += j;
                }
            }
            if (sum == i && i != 0) {
                System.out.println(i);
            }   

        }
    sc.close();
    }
}
