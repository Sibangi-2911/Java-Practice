package ConditionalsPractice;
//Character Check Instructor
import java.util.*;
public class Practice8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character (A-Z) or (a-z): ");
        String ch = sc.next();
        if(ch.equalsIgnoreCase("a")|| ch.equalsIgnoreCase("e") || ch.equalsIgnoreCase("i") || ch.equalsIgnoreCase("o") || ch.equalsIgnoreCase("u")){
            System.out.println("The entered character is a vowel");
        } else{
            System.out.println("The entered character is a consonant");
        }
    }
}
