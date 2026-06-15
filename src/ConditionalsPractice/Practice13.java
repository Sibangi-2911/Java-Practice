package ConditionalsPractice;
//Day Mood Detector Instructor

import java.util.*;
public class Practice13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day name: ");
        String day = sc.nextLine();
        boolean validDay = day.toLowerCase().endsWith("day");
        System.out.println(validDay?"It's a valid day name.":"Invalid Day name entered");
    }
}
