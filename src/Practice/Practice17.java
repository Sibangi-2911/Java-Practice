package Practice;
//Half String Problem

import java.util.*;
public class Practice17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sentence;
        System.out.print("Enter a sentence or a name: ");
        sentence = sc.nextLine();
        System.out.println("First Half is: "+sentence.substring(0,sentence.length()/2));
    }
}
