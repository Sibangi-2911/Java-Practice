package Loops;
// Word Reversal without loop

import java.util.*;
public class Practice14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = sc.next();
        String reversed = new StringBuilder(word).reverse().toString();
        System.out.println(reversed);
    }
}
