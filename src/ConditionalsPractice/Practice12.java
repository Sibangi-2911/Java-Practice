package ConditionalsPractice;
//Smart Login Validation Instructor

import java.util.*;
public class Practice12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();
        boolean valid = password.contains("@") && password.contains("0") || password.contains("1") || password.contains("2") || password.contains("3") || password.contains("4") || password.contains("5") || password.contains("6") || password.contains("7") || password.contains("8") || password.contains("9") ;
        System.out.println(valid?"Valid Password":"Invalid Password");
    }
}
