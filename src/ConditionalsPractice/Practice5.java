package ConditionalsPractice;
//Time Based Greeting Instructor

import java.util.*;
public class Practice5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the current hour(0-23): ");
        int currentHour = sc.nextInt();
        if(currentHour>=0 && currentHour<=11){
            System.out.println("Good Morning");
        } else if(currentHour>=12 && currentHour<=17){
            System.out.println("Good Afternoon");
        } else if(currentHour>=18 && currentHour<=23){
            System.out.println("Good Evening");
        } else {
            System.out.println("Please enter valid input");
        }
    }
}
