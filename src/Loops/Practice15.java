package Loops;
// check email domain

import java.util.*;
public class Practice15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = sc.next();
        if(email.endsWith("@gmail.com")){
            System.out.println("Valid Email");
        } else{
            System.out.println("Invalid email");
        }
    }
}
