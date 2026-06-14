package Practice;
//swap numbers

import java.util.*;
public class Practice19 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.print("Enter 2 numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping numbers are : "+a+" and "+b);
        int temp = a;
        a =b;
        b = temp;
        System.out.println("After swapping numbers are : "+a+" and "+b);
    }
}
