package Loops;
//Count the number of vowels in a sentence

import java.util.*;
public class Practice20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine().toLowerCase();
        int count = 0;
        for(int i=0;i<sentence.length();i++){
            char b = sentence.charAt(i);
            if(b=='a' || b=='e' || b=='i' || b=='o' || b=='u'){
                count++;
            }
        }
        System.out.println("Total no. of vowels: "+count);
    }
}
