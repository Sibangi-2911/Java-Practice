package ConditionalsPractice;
//Triangle side validation Instructor

import java.util.*;
public class Practice17 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        float side1 = sc.nextFloat();
        System.out.print("Enter second side: ");
        float side2 = sc.nextFloat();
        System.out.print("Enter third side: ");
        float side3 = sc.nextFloat();

        boolean validTriangle = (side1 + side2) > side3 || (side1 + side3) > side2 || (side2 + side3)>side1;
        System.out.println(validTriangle?"Valid Triangle":"Invalid Triangle");
    }
}
