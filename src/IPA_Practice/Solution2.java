package IPA_Practice;
// Create a program to count the number of words present in a given string. Create class Solution with main method.

import java.util.*;
public class Solution2 {
    public static int countWords(String str){
        if(str == null){
            return 0;
        }
        str = str.trim();
        if(str.length()==0){
            return 0;
        }
        String words[] = str.split("\\s+");
        return words.length;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = countWords(str);
        System.out.println(result);
    }
}
