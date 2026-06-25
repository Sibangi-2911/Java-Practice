package Loops;
// Character type checker

import java.util.*;
public class Practice18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        boolean isUpperCase = false, isLowerCase = false, isDigit = false, isSpecialChar = false;
        if(Character.isUpperCase(ch)){
            isUpperCase = true;
            System.out.println("The entered character is an uppercase character.");
        } else if(Character.isLowerCase(ch)){
            isLowerCase = true;
            System.out.println("The entered character is a lowercase character.");
        } else if(Character.isDigit(ch)){
            isDigit = true;
            System.out.println("The entered character is a digit.");
        } else if("@#$%&".contains(String.valueOf(ch))){
            isSpecialChar = true;
            System.out.println("The entered character is a special character.");
        } else{
            System.out.println("The entered character is invalid.");
        }
    }
}
