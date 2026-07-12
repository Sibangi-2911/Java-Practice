package IPA_Practice;
//  Write main method in Solution class. In the main method, read five values for an integer array and two int value which are the limits (limit1 and limit2). The main method should print the average of integer values which are greater than limit1 and less than limit2.
import java.util.*;
public class Solution4 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = sc.nextInt();
        }
        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();
        int sum =0;
        int count =0;
        for(int a: arr){
            if(a>limit1 && a<limit2){
                sum+=a;
                count++;
            }
        }
        System.out.println(sum/count);
    }
}
