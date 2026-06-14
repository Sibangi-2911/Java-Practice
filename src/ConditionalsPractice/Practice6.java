package ConditionalsPractice;
//Email Validator Instructor

import java.util.*;
public class Practice6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your email id to validate: ");
        String email = sc.nextLine();
        boolean validEmail = email.contains("@") && email.endsWith(".com");
        String emailValidation = validEmail?"Valid Email" : "Invalid email";
        System.out.print(emailValidation);
    }
}
