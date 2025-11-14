// To Count Occurrences of a Character in a String

import java.util.*;

class problem43{
    public static void main(String[] args){
        String s = "Java programming Java oops";
        int totalcount = s.length();
        int totalcount_afterRemove = s.replace("a","").length();
        int count = totalcount - totalcount_afterRemove;

        System.out.println("Number occurance of a is : " + count);



    }
}
