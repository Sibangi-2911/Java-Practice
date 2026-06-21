package Loops;
//Calculate the sum of digits of a number

import java.util.*;
public class Practice8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 4-digits: ");
        int num = sc.nextInt();
        int sum =0;
        for(int i=0;i<4;i++){
            int remainder = num % 10;
            sum = sum + remainder;
            num = num/10;
        }
        System.out.println("Sum of the digits of the entered number is "+sum);
    }
}
