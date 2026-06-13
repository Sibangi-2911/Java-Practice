package Practice;
import java.util.*;
//Compare product names
public class Practice5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String product1, product2;
        System.out.print("Enter the name of product 1: ");
        product1 = sc.nextLine();
        System.out.print("Enter the name of product 2: ");
        product2 = sc.nextLine();
        System.out.println(product1.equals(product2));
    }
}
