package Arrays;
//Print the entire array without loop and sorting an array
import java.util.Arrays;
public class Arr2 {
    public static void main(String args[]){
        int [] arr = {100,2,33,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
