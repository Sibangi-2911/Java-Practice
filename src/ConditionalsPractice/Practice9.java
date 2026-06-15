package ConditionalsPractice;
//Character Check Instructor

import java.util.*;
public class Practice9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char a = sc.next().charAt(0);
        boolean vowel = "aeiouAEIOU".contains(String.valueOf(a));
        System.out.println(vowel?"vowel":"consonant");
    }
}
