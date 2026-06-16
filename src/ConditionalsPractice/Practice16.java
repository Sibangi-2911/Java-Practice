package ConditionalsPractice;
// Name Analysis Instructor

import java.util.*;
public class Practice16 {
   public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter your name: ");
       String name = sc.next();
       boolean vowel = "aeiouAEIOU".contains(String.valueOf(name.charAt(0)));
       boolean vowel1 = "aeiouAEIOU".contains(String.valueOf(name.charAt(name.length()-1)));
       System.out.println((vowel && vowel1)? "Valid name": "Invalid name");
   }

}
