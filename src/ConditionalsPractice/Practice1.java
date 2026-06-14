package ConditionalsPractice;
//Temperature Alert System Instructor

import java.util.*;
public class Practice1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter today's temperature: ");
        Double temp = sc.nextDouble();
        if(temp>20 && temp<30){
            System.out.println(temp+" is normal temperature.");
        } else {
            System.out.println(temp+" temperature out of range!!!");
        }
    }
}
