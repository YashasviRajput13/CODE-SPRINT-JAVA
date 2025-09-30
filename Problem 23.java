//Finding the Largest and Smallest Numbers in an Array

class Problem23 {
    public static void main(String [] args){
        int a[] = {50,30,40,20,60};
        int max = a[0]; //let a[0] be the largest number
        int min = a[0]; //let a[0] be the smallest number

        for(int i=1; i<a.length; i++){
            if(a[i]>max)
            {
                max = a[i];
            }
            if(a[i]<min)
            {
                min = a[i];
            }
        }
        System.out.println("Largest number is: " + max);
        System.out.println("Smallest number is: " + min);   
    }
}
