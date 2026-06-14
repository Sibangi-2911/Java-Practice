package ConditionalsPractice;
//Username Validation Instructor

import java.util.*;
public class Practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an username: ");
        String name = sc.nextLine();
        if(name.length()>6 && !name.contains(" ") && Character.isLetter(name.charAt(0))){
            System.out.print("Valid Username");
        } else{
            System.out.print("Invalid Username");
        }
    }
}
