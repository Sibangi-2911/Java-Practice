package Practice;
//Switch case example

import java.util.*;
public class Practice21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Coffee Shop!!!");
        System.out.println("1. latte");
        System.out.println("2. cappuccino");
        System.out.println("3. espresso");
        System.out.print("Enter your choice:  ");
        int choice = sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("You selected latte");
                break;
            case 2:
                System.out.println("You selected cappuccino");
                break;
            case 3:
                System.out.println("You selected espresso");
                break;
            default:
                System.out.println("Enter your valid choice");
        }
    }
}
