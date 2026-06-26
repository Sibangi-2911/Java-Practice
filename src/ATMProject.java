//Console based atm machine
import java.util.*;
public class ATMProject {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String cardNumber ="4321";
        String pin = "1234";
        String userName = "tech";
        double balance = 5000;
        System.out.println("==============================================================");
        System.out.println("                     WELCOME TO JAVA ATM");
        System.out.println("==============================================================");
        System.out.print("Enter your card number: ");
        String enteredCardNum = sc.nextLine();
        if(!enteredCardNum.equals(cardNumber)){
            System.out.println("Invalid card number!!! Please try again later");
            return;
        }
        boolean isverified = false;
        for(int i=0;i<=3;i++){
            System.out.print("Enter a 4-digit pin: ");
            String enteredPin = sc.nextLine();
            if(enteredPin.equals(pin)){
                isverified=true;
                System.out.println("Access granted!! Welcome");
                break;
            } else{
                System.out.println("Wrong pin attempted.You can try for "+(3-i)+" times.");
            }
        }
        if(!isverified){
            System.out.println("Too many attempts!! Card is blocked!!");
            return;
        }
        while(true){
            System.out.println("============================MAIN MENU===================================");
            System.out.println("1-> Check Balance");
            System.out.println("2-> Deposit Money");
            System.out.println("3-> Withdraw Money");
            System.out.println("4-> Change Pin");
            System.out.println("5-> Exit App");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            if(choice==1){
                System.out.println("Your account balance is: $ "+balance);
            } else if(choice==2){
                System.out.print("Enter the amount you want to deposit: $ ");
                double deposit = sc.nextDouble();
                if(deposit>0){
                    balance = balance+deposit;
                    System.out.println("Your balance is: $ "+balance);
                } else{
                    System.out.println("Sorry!!! We cannot do it.");
                }
            } else if(choice==3){
                System.out.println("Enter the amount to withdraw: ");
                double withdraw = sc.nextDouble();
                if(withdraw>balance){
                    System.out.println("The entered amount cannnot be withdrawn");
                } else{
                    balance = balance-withdraw;
                    System.out.println("Withdrawn Successfully!!!");
                    System.out.println("Your balance after withdrawal is: "+balance);
                }
            }
            else if(choice==4){
                sc.nextLine();
                System.out.print("Enter your old pin: ");
                String oldPin = sc.nextLine();
                if(oldPin.equals(pin)){
                    System.out.print("Enter your new pin: ");
                    String newPin = sc.nextLine();
                    if(newPin.length()==4 && newPin.matches("\\d+")){
                        pin = newPin;
                        System.out.println("Pin Changed Successfully");
                    } else{
                        System.out.println("Invalid Pin format!!!");
                    }
                }
            }
            else if(choice==5){
                break;
            } else{
                System.out.println("Invalid Input!!!");
            }
        }
        sc.close();
    }
}
