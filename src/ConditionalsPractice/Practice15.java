package ConditionalsPractice;
//Grade Check Instructor

import java.util.*;
public class Practice15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();
        boolean pass = marks>=50;
        System.out.println(pass?"Pass":"Fail");
    }
}
