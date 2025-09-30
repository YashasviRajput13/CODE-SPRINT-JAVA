//Calculate armstrong number
//An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits.
    class solution6 {
    public static void main(String[] args) {
        int num = 153; 
        int t1 = num;
        int length = 0;
        while (t1 != 0) {
            length++;
            t1 = t1 / 10; // Remove the last digit
        }
        int t2 = num;
        int armstrong = 0;
        while (t2 != 0) {
            int mul = 1; // Initialize mul to 1 for each digit
            int rem = t2 % 10; // Get the last digit
            for (int i = 1; i <= length; i++) { // Raise the digit to the power of length
                mul = mul * rem;
            }
            armstrong = armstrong + mul;
            t2 = t2 / 10;
        }
        if (armstrong == num) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
}