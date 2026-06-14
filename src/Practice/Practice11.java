package Practice;
//Hidden Password Display
import java.util.*;
public class Practice11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String password;
        System.out.print("Enter your password: ");
        password = sc.nextLine();
        System.out.println(password.replaceAll(".","*"));
    }
}
