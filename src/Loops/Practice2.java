package Loops;
//Looping example

import java.util.*;
public class Practice2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("How many times you want to print your name: ");
        int desire = sc.nextInt();
        int i =0;
        while(i<desire){
            System.out.println(name);
            i++;
        }
    }
}
