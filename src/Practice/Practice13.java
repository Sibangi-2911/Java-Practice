package Practice;
//Calculate user age
import java.util.*;
public class Practice13 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.print("Enter your current age: ");
        age = sc.nextInt();
        System.out.println("Age of user after 5 years will be: "+(age+5));
    }
}
