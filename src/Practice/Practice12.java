package Practice;
//Calculate area

import java.util.*;
public class Practice12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double length, width;
        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        width = sc.nextDouble();
        double area = length * width;
        System.out.println("Area of the rectangle is: "+area);
    }
}
