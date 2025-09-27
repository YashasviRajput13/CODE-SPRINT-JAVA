//Reversing a String
import java.util.Scanner;

class Problem18 {
    public static void main(String[] args) {
        System.out.println("Enter a string to reverse:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r = "";
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            r = ch + r;
        }

        System.out.println(r);
        sc.close();
    }
}