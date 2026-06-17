package ConditionalsPractice;
// String Reverse Equality Instructor

import java.util.*;
public class Practice18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first 3 letter word: ");
        String s1 = sc.next();
        System.out.print("Enter second 3 letter word: ");
        String s2 = sc.next();
        boolean reverse = s1.charAt(0) == s2.charAt(2) && s1.charAt(1) == s2.charAt(1) && s1.charAt(2) == s2.charAt(0);
        System.out.println(reverse?"Reverse matched":"Reverse doesn't match");
    }
}
