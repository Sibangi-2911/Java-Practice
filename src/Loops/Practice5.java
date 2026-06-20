package Loops;

import java.util.Scanner;

// Display of table of any number that is entered
public class Practice5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number here: ");
        int num = sc.nextInt();
        int i = 1;
        while(i<=10){
            System.out.println(i+" X "+num+" = "+i*num);
            i++;
        }
    }
}
