package ConditionalsPractice;
//Two Factor Access System Instructor

import java.util.*;
public class Practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        System.out.print("Do you have otp (true/false)");
        boolean otp = sc.nextBoolean();
        if(password.equals("1234") && otp==true){
            System.out.println("Access granted");
        } else{
            System.out.println("Access denied");
        }
    }
}
