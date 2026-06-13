package Practice;
//Calculate item total

import java.util.*;
public class Practice2 {
    public static void main() {
        Scanner sc = new Scanner(System.in);
        double price;
        int quantity=0;
        System.out.print("Enter the price: ");
        price = sc.nextDouble();
        System.out.print("Enter the quantity: ");
        quantity = sc.nextInt();
        double total = price*quantity;
        System.out.println("The total is: "+total);

    }
}
