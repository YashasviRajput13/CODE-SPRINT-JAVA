//Finding the Sum of Digits of a Number Until Zero
class Problem29 {
    public static int sumOfDigits(int n)
    {
        int sum = 0;
        while(n > 0)
        {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static void main(String [] args)
    {
        int number = 12345;
        int result = number;
        while(result > 0)
        {
            result = sumOfDigits(result);
            System.out.println("Intermediate Sum: " + result);
        }
        System.out.println("Final Sum of Digits until zero: " + result);
    }
}   