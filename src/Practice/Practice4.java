package Practice;
//Billing with discount code
import java.util.*;
public class Practice4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double price;
        int quantity=0;
        double total;
        double discount;
        System.out.print("Enter the price: ");
        price = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();
        total = price*quantity;
        discount = total*0.10;
        total-=discount;
        System.out.println("The total bill after 10% discount is: "+total);
        
    }
}
