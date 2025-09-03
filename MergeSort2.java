import java.util.Arrays;

public class MergeSort2
{
    public static void main(String[] args)
    {
        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        int left = 0;
        int right = (ar.length) - 1 ;
        mergeSort(ar  , left , right) ;
        System.out.println(Arrays.toString(ar));
    }
    public static void mergeSort(int[] arr , int left , int right)
    {
        if (left < right)
        {
            int mid = (left + right) / 2 ;
            // the left array (which will also has the mid value)
            mergeSort(arr , left , mid );
            mergeSort(arr , mid +1 , right );
            merge(arr , left , mid , right) ;

        }
    } // end mergeSort
    public static void merge(int[] arr , int left , int mid , int right)
    {
        int leftArray_length = mid - left +1 ; // contain the mid value in the left array
        int rightArray_length = right - mid ;
        int[] leftArray = new int[leftArray_length] ;
        int[] righttArray = new int[rightArray_length] ;
        int k = left ; // pointer to put the values in its right position after comparison
        int i = 0; // pointer for the left array
        int j = 0 ;  // pointer for the right array

        // put values for the   left array
        for (int q = 0 ; q  < leftArray_length; q++)
        {
            leftArray[q] = arr[q + left];
        }
        // put values for the right array
        for (int q = 0 ; q  < rightArray_length; q++)
        {
            righttArray[q] = arr[q + mid +1];
        }

        // compare and merge
        while(i < leftArray_length && j < rightArray_length)
        {
            if(leftArray[i] <= righttArray[j])
            {
                arr[k] = leftArray[i] ;
                i++;
            }
            else
            {
                arr[k] = righttArray[j];
                j++;
            }


            k++;
        }


        // add the remaining elements from both left and right arrays
        while( i < leftArray_length )
        {
            arr[k] = leftArray[i];
            i++;
            k++;
        }
        while( j < rightArray_length )
        {
            arr[k] = righttArray[j];
            j++;
            k++;
        }

    } // end merge

}
