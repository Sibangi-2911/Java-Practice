package Loops;
// Electricity Bill- 100<unit---> 10, 101-200--->15, 200<unit--->20 if bill>3000--->10% surcharge

import java.util.*;
public class Practice17 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your units: ");
        double unit = sc.nextDouble();
        if(unit<=100){
            System.out.println("Your Electricity bill is: "+unit*10);
        } else if(unit>100 && unit<200){
            System.out.println("Your Electricity bill is: "+unit*15);
        } else if(unit>200){
            double bill = unit*20;
            if(bill>3000){
                double tax = bill*0.10;
                double totalBill = bill + tax;
                System.out.println("Your Electricity bill is: "+bill+" but after applying tax it is: "+totalBill);
            }
        }
    }
}
