package ConditionalsPractice;
//Discount Eligibility Instructor

import java.util.*;
public class Practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount of money spent: ");
        double money = sc.nextDouble();
        System.out.print("Do you have membership? (true/false)");
        boolean hasMembership = sc.nextBoolean();
        if(money>5000 || hasMembership==true){
            System.out.println("Eligible for discount.");
        } else{
            System.out.println("Not Eligible for discount");
        }
    }
}
