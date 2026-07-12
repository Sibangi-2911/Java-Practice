package IPA_Practice;

import java.util.*;
public class Solution12 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String ans = st.toLowerCase();
        for(int i=0;i<ans.length();i++){
            if(ans.charAt(i) == 'a' || ans.charAt(i)=='e' || ans.charAt(i)=='i' || ans.charAt(i)=='o' || ans.charAt(i)=='u'){
                continue;
            } else{
                System.out.print(ans.charAt(i));
            }
        }
    }
}
