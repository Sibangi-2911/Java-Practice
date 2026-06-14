package ConditionalsPractice;
//Compare names ignoring case instructor

import java.util.*;
public class Practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = sc.nextLine();
        System.out.print("Enter another name: ");
        String name1 = sc.nextLine();

        boolean same = name.equalsIgnoreCase(name1);
        System.out.println(same?"same name":"different name");
    }
}
