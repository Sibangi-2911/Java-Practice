package Loops;
//Calculate total product price using for loop

import java.util.*;
public class Practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double bill = 0;
        for(int i=0;i<=5;i++){
            System.out.print("Enter your product price: ");
            double price = sc.nextInt();
            bill = bill + price;
        }
        System.out.println("Total price: "+bill);

    }
}
