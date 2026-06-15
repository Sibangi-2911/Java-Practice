package ConditionalsPractice;
//Last Digit Match Instructor

import java.util.*;
public class Practice10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers to compare: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        boolean lastDigit = (num1%10) == (num2%10);
        System.out.println(lastDigit?"same":"not same");
    }

}
