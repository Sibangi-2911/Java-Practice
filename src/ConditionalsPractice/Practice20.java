package ConditionalsPractice;
//Simple bank transaction instructor

import java.util.*;
public class Practice20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input your account balance: ");
        int balance = sc.nextInt();
        System.out.print("Input the withdrawal amount: ");
        int withdrawalAmount = sc.nextInt();
        System.out.print("Enter your pin: ");
        int pin = sc.nextInt();

        boolean successfulWithdrawal = balance>=withdrawalAmount && pin==1234;
        System.out.println(successfulWithdrawal?"Amount Withdrawn Successfully":"Unsuccessful");
    }
}
