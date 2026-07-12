package IPA_Practice;

import java.util.*;
public class Solution11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        int v =0, c=0;
        String n = num.toLowerCase();
        for(int i=0;i<n.length();i++){
            if(Character.isLetter(n.charAt(i))){
                if(n.charAt(i)=='a'|| n.charAt(i)=='e' || n.charAt(i)=='i' || n.charAt(i)=='o' || n.charAt(i)=='u'){
                    v++;
                } else{
                    c++;
                }
            }
        }
        if(v>0 || c>0){
            System.out.println("Number of vowels: "+v);
            System.out.println("Number of consonants: "+c);
        } else{
            System.out.println("NA");
        }
    }
}
