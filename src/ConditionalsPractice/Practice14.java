package ConditionalsPractice;
//Product Discount Decision Instructor

import java.util.*;
public class Practice14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price: ");
        int price = sc.nextInt();
        System.out.print("Enter Promo code: ");
        String code = sc.next();
        boolean discount = code.toUpperCase().startsWith("SAVE") && price>1000;
        System.out.println(discount?"Eligible for discount": "Not Eligible for discount");
    }
}
