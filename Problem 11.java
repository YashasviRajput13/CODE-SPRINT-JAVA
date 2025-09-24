//Generating multiplication table for a given number
import java.util.Scanner;
class Problem11
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scn.nextInt();
        System.out.println("Multiplication table for " + num + ":");
        for(int i=1; i<=10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
        scn.close();
    }
}
