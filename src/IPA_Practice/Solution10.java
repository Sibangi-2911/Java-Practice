package IPA_Practice;

import java.util.*;
public class Solution10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String st = String.valueOf(num);
        StringBuilder ans = new StringBuilder();
        ans.append(st);
        ans.reverse();
        System.out.println("Reverse of the number is: "+ans);
    }
}
