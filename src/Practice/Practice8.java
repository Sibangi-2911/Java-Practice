package Practice;
//Calculate average marks
import java.util.*;
public class Practice8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        System.out.print("Enter your math marks: ");
        a = sc.nextDouble();
        System.out.print("Enter your science marks: ");
        b = sc.nextDouble();
        System.out.print("Enter your java marks: ");
        c = sc.nextDouble();
        double average = (a+b+c)/3;
        System.out.println("The average marks for the student is: "+average);
    }
}
