package Arrays;
//Storing marks of students

import java.util.*;
public class Arr1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[4];
        System.out.println("Enter the marks of Students: ");
        for(int i=0;i<marks.length;i++){
            marks[i] = sc.nextInt();
        }
        for(int i=0;i<marks.length;i++){
            System.out.println("The marks are : "+marks[i]);
        }
    }
}
