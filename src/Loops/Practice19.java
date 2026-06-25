package Loops;
// Check for palindrome number

import java.util.*;
public class Practice19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int b = num;
        int sum = 0;
        while(num>0){
            int remainder = num % 10;
            sum = (sum*10) + remainder;
            num = num/10;
        }
        if(sum==b){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
