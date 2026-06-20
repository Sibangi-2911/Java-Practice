package Loops;
// Displaying and counting all the letters of a word backwards using while loop

import java.util.*;
public class Practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word here: ");
        String word = sc.next();
        int i = word.length()-1;
        int count = 0;
        while(i>=0){
            System.out.println(word.charAt(i));
            i--;
            count++;
        }
        System.out.println("Total count of letters in the word "+ word+" is: "+count);
    }
}
