package Loops;
// Compare two Sentences

import java.util.*;
public class Practice12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st sentence: ");
        String sentence1 = sc.next();
        System.out.print("Enter 2nd Sentence: ");
        String sentence2 = sc.next();
        
        if(sentence1.equalsIgnoreCase(sentence2)){
            System.out.println("Both are equal.");
        } else{
            System.out.println("Both are not equal.");
        }
    }
}
