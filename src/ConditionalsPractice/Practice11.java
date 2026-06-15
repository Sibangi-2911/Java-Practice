package ConditionalsPractice;
//Keyword Detection Instructor

import java.util.*;
public class Practice11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        sentence = sentence.toLowerCase();
        boolean containsWord = sentence.contains("java");
        System.out.println(containsWord);
    }
}
