package IPA_Practice;
// solve sum of odd numbers within specified range
import java.util.*;
public class Solution8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        int sum =0;
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                sum+=arr[i];
            }
        }
        if(sum>8 && sum<50){
            System.out.println("Sum of odd numbers: "+sum);
        } else {
            System.out.println("NA");
        }
    }
}
