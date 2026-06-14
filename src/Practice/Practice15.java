package Practice;
//Email Validation

import java.util.*;
public class Practice15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String email;
        System.out.println("Enter your email id to validate: ");
        email = sc.nextLine();
        System.out.println(email.contains("@gmail.com"));
    }
}
