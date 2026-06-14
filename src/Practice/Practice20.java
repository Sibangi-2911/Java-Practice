package Practice;
//Swap 2 words

import  java.util.*;
public class Practice20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Enter a sentence: ");
        sentence = sc.nextLine();
        String[] part = sentence.split(" ");
        System.out.println(part[1]+" "+part[0]);
    }
}
