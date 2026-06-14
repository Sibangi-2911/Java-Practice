package Practice;
//Simple Interest

import java.util.*;
public class Practice18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double principalAmount, rate, time;
        System.out.print("Enter principal amount: ");
        principalAmount = sc.nextDouble();
        System.out.print("Enter rate of interest: ");
        rate = sc.nextDouble();
        System.out.print("Enter time period in years: ");
        time = sc.nextDouble();
        double simpleInterest = (principalAmount*rate*time)/100;
        System.out.println("The SI is : "+simpleInterest);
    }
}
