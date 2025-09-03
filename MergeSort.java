import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        int left = 0;
        int right = (ar.length) - 1 ;
        mergeSort(ar  , left , right) ;
        System.out.println(Arrays.toString(ar));

    } // end main

    public static void mergeSort(int[] ar , int left, int right ) {
        // we will use recursion every time we get a mid and the subarray < 2
        // the big array will splitted by the median index
        // the comparison is only done when 2 elements in the subarray
        // the swap happens when comparing
        // when merging compare the first element of the left with
        // the first element of the second array
        if (left < right)
        {
            int mid = (right + left) / 2;
            mergeSort(ar, left, mid); // the left subarray
            mergeSort(ar, mid + 1, right); // the right subarray
            merge(ar, left, mid, right);
        }
        } // end mergeSort

    public static void merge(int[] ar, int left , int mid , int right )
    {
        // compare and swap and combine or merge
        int a1 = mid - left + 1 ;
        int a2 = right - mid ;
        int[] leftArray   = new int[a1] ;
        int[] righttArray = new int[a2];

        for (int i = 0; i <  a1 ; i++) // for the left array
        {
                leftArray[i] = ar[left+i];
        }

        for (int j  = 0; j < a2 ; j++) // for the right array
        {
            righttArray[j] = ar[mid+1+j];
        }

        int i = 0 ; // for only leftArray
        int j = 0 ; // for only rightArray
        int k = left ; // the sorted array index pointer
        while (i < a1 && j < a2)
        {
            if (leftArray[i] <= righttArray[j])
            {
                ar[k] = leftArray[i] ;
                i++;
            }
            else
            {
                ar[k]  = righttArray[j];
                j++;

            }
            k++;
        }
        // adding remained elements of the  2 subarrays to the array
        while (i < a1)
        {
            ar[k] = leftArray[i];
            i++;
            k++;
        }
        while (j < a2)
        {
            ar[k] = righttArray[j];
            j++;
            k++;
        }
    }// end merge



}
