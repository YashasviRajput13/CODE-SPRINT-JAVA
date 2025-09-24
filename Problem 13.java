//Checking the number is Narcissistic or not
//a number that is equal to the sum of its own digits each raised to the power of the total number of digits in the number

import static java.lang.Math.pow;
import java.util.Scanner;
class Problem13
{
    int count(int n)
    {
    if(n == 0)
    return 0;
    return 1 + count(n/10);     
}
boolean check(int n) {
    int l = count(n);
    int sum = 0, temp = n;
    while(temp > 0)
    {
        int lastDigit = temp % 10;
        sum += pow(lastDigit, l);
        temp /= 10;
    }
    return (n==sum);
}

public static void main(String args[])
{
    Scanner scn = new Scanner(System.in);
    System.out.print("Enter a number: ");
    int num = scn.nextInt();
    Problem13 obj = new Problem13();
    if(obj.check(num))
    {
        System.out.println(num + " is a Narcissistic number.");
    }
    else
    {
        System.out.println(num + " is not a Narcissistic number.");
    }
    scn.close();
}
}
