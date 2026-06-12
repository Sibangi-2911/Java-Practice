import java.util.Scanner;
public class inputExample1 {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int price;
        float quantity;
        System.out.println("Enter the price: ");
        price = sc.nextInt();
        System.out.println("Enter the quantity: ");
        quantity = sc.nextFloat();
        float totalBill = price *quantity;
        System.out.println("The total bill is : "+totalBill);
    }
}
