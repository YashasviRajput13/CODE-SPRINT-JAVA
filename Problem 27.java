//Finding the Average of Numbers in an Array
class Problem27 {
    public static void main(String [] args)
    {
        int a[] = {1,2,3,4,5};
        int sum = 0;
        for(int i=0; i<a.length; i++)
        {
            sum += a[i];
        }
        double average = sum / (double)a.length;
        System.out.println("The average is: " + average);   
    }
}