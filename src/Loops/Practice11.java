package Loops;
//Username validator

import java.util.*;
public class Practice11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username: ");
        String userName = sc.next();
        if(Character.isUpperCase(userName.charAt(0)) && Character.isDigit(userName.charAt(userName.length()-1))){
            System.out.println("Valid Username");
        } else{
            System.out.println("Invalid Username");
        }
    }
}
