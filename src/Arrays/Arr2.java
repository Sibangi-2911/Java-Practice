package Arrays;
//Print the entire array without loop and sorting an array
import java.util.Arrays;
public class Arr2 {
    public static void main(String args[]){
        int [] arr = {100,2,33,4};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        //Comparing Arrays
        int arr1[]= {100,2,33,4};
        System.out.println(Arrays.equals(arr, arr1));

        //Making a copy of an array
        int a[] = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(a));

        //Printing a certain range of elements from an array led to forming a new array
        int b[] = Arrays.copyOfRange(arr1,1,arr1.length-1);
        System.out.println(Arrays.toString(b));

        //Replacing all the values of an array at once with same number
        Arrays.fill(arr1,0);
        System.out.println(Arrays.toString(arr1));

        //Binary Search
        System.out.println(Arrays.binarySearch(arr,33));

        //Sum of elements in an array
        int c[] = {1,2,4,3,5};
        System.out.println(Arrays.stream(c).sum());
        System.out.println(Arrays.stream(c).max());

        //Parallel Sorting---> Faster becoz multithreading involved
        Arrays.parallelSort(c);
        System.out.println(Arrays.toString(c));
    }
}
