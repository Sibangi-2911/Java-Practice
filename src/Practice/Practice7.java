package Practice;
//Check file extension

import java.util.*;
public class Practice7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String fileName;
        System.out.print("Enter the file name with extension: ");
        fileName = sc.nextLine();
        System.out.println(fileName.endsWith(".java")?"java file detected":"Not a java file");
    }
}
