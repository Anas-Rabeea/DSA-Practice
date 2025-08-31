import java.util.Arrays;

public class InsertionSort
{
    public static void main(String[] args)
    {

        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        int[] sortedar = insertionSot(ar) ;
        System.out.println("Sorted Array  : " + Arrays.toString(sortedar));
    } // end main

    public  static int[] insertionSot(int[] arr)
    {
        // we use shifting and not swapping
        // Time Complexity is O(n^2) bc we have 2 loops
        //  int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        // make the minimum value at the start
        int n = arr.length ;
        for (int i = 1; i < n; i++)
        {
            int key =  arr[i]; // the value which we want to compare with
            int j = i-1 ;
            while (j >=0 && key < arr[j] )
            {
                arr[j+1] = arr[j]; // shifting bigger elements to the right
                j--;
            }
            j++;
            arr[j] = key; // placing the small element at its position at the end of the iteration
        }
        return arr ;
    } // end insertionsort


}
