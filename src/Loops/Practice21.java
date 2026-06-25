package Loops;
// Detect Repeated Character

import java.awt.*;
import java.util.*;
public class Practice21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s1 = sc.nextLine();
        boolean found = false;
        for(int i=0;i<s1.length();i++){
            char c = s1.charAt(i);
            if(s1.indexOf(c) != s1.lastIndexOf(c)){
                System.out.println("Repeated");
                found = true;
            }
        }
        if(found==false){
            System.out.println("Not Repeated");
        }
    }
}
