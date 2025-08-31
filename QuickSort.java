import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args) {
        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
         quickSort(ar , 0 , ar.length -1 )  ;
        System.out.println("Sorted Array  : " + Arrays.toString(ar));
    } // end main

    public static void quickSort(int[] arr , int low , int high )
    {
        if (low < high)
        {
            int partitionIndex = partition(arr , low , high) ; // this will return the index of the sorted value which is the pivot
            // divide and recursion
            quickSort(arr , low , partitionIndex -1) ; // the left subquery (values smaller than the Pivot value)
            quickSort(arr , partitionIndex +1 , high) ; // the right subquery (values Bigger than the Pivot value)
        }
    } //end quickSort

    public static int partition(int[] arr, int low , int high)
    {
        // this will return us the partitionIndex and
        int pivotValue = arr[high] ;
        int n = arr.length ;
        int i = low -1 ;

        for(int j = low ; j < n ; j++)
        {
            if (arr[j] < pivotValue)
            {
                i++ ;
                // swap arr[i] and arr[j]
                int temp = arr[i] ;
                arr[i] = arr[j] ;
                arr[j] = temp ;
            } // end if
        } // end inner loop
        int temp = arr[i+1] ;
        arr[i+1] = arr[high] ;
        arr[high] = temp;
        return i+1;


    } // end partition

}
