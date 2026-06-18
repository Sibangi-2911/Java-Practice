package Loops;
//Count of digits in a number example using while loop

import java.util.*;
public class Practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int number = sc.nextInt();
        int i =0;
        int count =0;
        while(number!=0){
            number = number/10;
            count++;
            i++;
        }
        System.out.print("Count of all values: "+count);
    }
}
