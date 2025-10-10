//Finding All Pairs of Elements in an Array that Add Up to a Given Sum
class Problem31 {
    public static void findPairs(int[] arr,int n, int Sum) {
        int i = 0, j=n-1, k=0, ans = 0;
        while(i<j) {
            k = arr[i] + arr[j];
            if(k == Sum) {
                ans++;
                System.out.println("Pair found: (" + arr[i] + ", " + arr[j] + ")");
                i++;
                j--;
            }
            else if(k>Sum) {
                j--;
            }
            else {
                i++;
            }
        } 
        if(ans == 0) {
            System.out.println("No pairs found that add up to " + Sum);
        }       
    }   
}
