// Calculating the Sum of Even number in a range

import java.util.Scanner;
class Problem12
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int n1 = scn.nextInt();
        System.out.print("Enter the end of the range: ");
        int n2 = scn.nextInt();
        int sum = 0;
        for(int i=n1; i<=n2; i++)
        {
            if(i%2 == 0)
            {
                sum += i;
            }

        }
        System.out.println("Sum of even numbers between " + n1 + " and " + n2 + " is: " + sum);
        scn.close();

}
}