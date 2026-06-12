import java.util.Locale;

public class StringMethod1 {
    public static void main(String args[]){
        //length of the string
        String str = "Hello It's my birthday!!";
        System.out.println("The length of the string is : "+str.length());

        //uppercase & lowercase
        String str2 = "hElLo It's My bIrThDay";
        System.out.println(str2.toUpperCase());
        System.out.println(str2.toLowerCase());
        System.out.println(str2.charAt(8));
        System.out.println(str2.contains("my"));
        System.out.println(str2.contains("My"));
        System.out.println(str2.replace("My", "my"));
        String str3 = " everyone!!!";
        System.out.println(str2.concat(str3));

        String str4 = "Sibangi";
        System.out.println(str4.substring(1,5));

    }
}
