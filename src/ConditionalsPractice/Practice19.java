package ConditionalsPractice;
//Number Analyzer Instructor

import java.util.*;
public class Practice19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean validNum = num%2==0 && num>50;
        System.out.println(validNum?"Entered number is even and greater than 50":"Not Applicable");
    }
}
