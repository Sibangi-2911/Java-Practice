package Practice;
import java.util.*;
public class Practice6 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String user;
        System.out.print("Enter the user: ");
        user = sc.nextLine();
        System.out.println(user.startsWith("admin"));
    }
}
