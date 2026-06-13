package Practice;

//Name Formatter

import java.util.*;
public class Practice3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = sc.nextLine();
        System.out.println("Converted to uppercase: "+name.toUpperCase());
        System.out.println("Coversion to lowercase: "+name.toLowerCase());
    }
}
