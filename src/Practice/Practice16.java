package Practice;
//Extract Domain name

import java.util.*;
public class Practice16 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.print("Enter a name: ");
        name = sc.nextLine();
        System.out.println(name.substring(4));
        System.out.println(name.substring(4,6));
    }
}
