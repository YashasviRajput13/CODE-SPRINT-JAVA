//Calculate armstrong number

    class solution6 {
    public static void main(String[] args) {
        int num = 153;
        int t1 = num;
        int length = 0;
        while (t1 != 0) {
            length++;
            t1 = t1 / 10;
        }
        int t2 = num;
        int armstrong = 0;
        while (t2 != 0) {
            int mul = 1;
            int rem = t2 % 10;
            for (int i = 1; i <= length; i++) {
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