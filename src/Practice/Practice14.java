package Practice;
//Currency Converter
import java.util.*;
public class Practice14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        double currency;
        System.out.print("Enter your currency: ");
        currency = sc.nextDouble();
        System.out.println("After conversion, your cash is "+(currency*280));
    }
}
