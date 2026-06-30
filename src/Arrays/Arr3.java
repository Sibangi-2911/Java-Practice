package Arrays;
import java.util.*;
public class Arr3 {
    public static void main(String args[]){
        //Create array without looping
        int arr[] = new int[5];
        Arrays.setAll(arr, i->i*3);
        System.out.println(Arrays.toString(arr));

        //Compare 2 arrays and return the index where there is mismatch of values
        int a[] = {1,2,3,8};
        int b[] = {1,5,3};
        System.out.println(Arrays.mismatch(a,b));

        //Compare which array is greater
        System.out.println(Arrays.compare(a,b));

        //prefix
        Arrays.parallelPrefix(a,(int x, int y)->x+y);
        System.out.println(Arrays.toString(a));


    }
}
