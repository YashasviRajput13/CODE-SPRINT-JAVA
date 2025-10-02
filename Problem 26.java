//Finding the Median of an Array
import java.util.Arrays;
class Problem26 {
    public static void main(String[] args) {
        int[] numbers = {3, 1, 4, 2, 5};
        Arrays.sort(numbers);
        double median;
        int n = numbers.length;
        if (n % 2 == 0) {
            median = (numbers[n / 2 - 1] + numbers[n / 2]) / 2.0;
        } else {
            median = numbers[n / 2];
        }
        System.out.println("The median is: " + median);
    }
}