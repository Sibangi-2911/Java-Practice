package Loops;
//Lucky Number Game

import java.util.*;
public class Practice13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to check if you are lucky enough: ");
        int num = sc.nextInt();
        if(num%3==0 && num%5==0){
            System.out.println("Lucky Number!!!");
        } else{
            System.out.println("Not lucky!!! Try again");
        }
    }
}
