package Loops;
//Check for strong password - 8 char, uppercase letter, 1 digit, special char

import java.util.*;
public class Practice16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password: ");
        String pass = sc.next();
        boolean hasuppercase = false, hasdigit = false, hasspecialchar = false;
        for(int i=0;i<pass.length();i++){
            char c = pass.charAt(i);
            if(Character.isUpperCase(c)){
                hasuppercase=true;
            }
            if(Character.isDigit(c)){
                hasdigit=true;
            }
            if("@#$&%".contains(String.valueOf(c))){
                hasspecialchar=true;
            }
        }
        if(pass.length()>=8 && hasuppercase==true && hasdigit==true && hasspecialchar==true){
            System.out.println("The entered one is a strong pssword.");
        } else{
            System.out.println("Weak Password");
        }
    }

}
