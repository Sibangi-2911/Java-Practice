package Practice;
//Replace Name part
import java.util.*;
public class Practice9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.println(name.replace("Seetal", "Sibangi"));
    }
}
