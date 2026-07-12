package IPA_Practice;

// Write a Java program to check whether the sum of the digits of a given integer is divisible by 3.
import java.util.*;
public class Solution6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        while(num>0){
            sum+=num%10;
            num/=10;
        }
        if(sum%3==0){
            System.out.println("TRUE");
        } else{
            System.out.println("FALSE");
        }
    }
}
