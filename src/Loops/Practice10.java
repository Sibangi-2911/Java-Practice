package Loops;
// problem statement - salary>10k--->10% tax && 5k-10k--->5%

import java.util.*;
public class Practice10 {
    public static  void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your salary amount: ");
        double salary = sc.nextDouble();
        if(salary>10000){
            double tax = salary*0.10;
            double finalSalary = salary-tax;
            System.out.println("Your salary amount was "+salary+" but after tax deduction the amount is "+finalSalary);
        } else if(salary>5000 && salary<10000){
            double tax = salary*0.05;
            double finalSalary = salary-tax;
            System.out.println("Your salary amount was "+salary+" but after tax deduction the amount is "+finalSalary);
        } else{
            System.out.println("Your salary is: "+salary);
        }

    }
}
