import java.util.Arrays;

public class SelectionSort
{
    // Time Complexity is O(n^2) as there is 2 for loops (each with O(n))
    // for every iteration we see the max value of the unsorted and put it in its right position
    public static void main(String[] args) {
        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        int[] sortedar = selectionSortWithMaxValue(ar) ;
        System.out.println("Sorted with max value " + Arrays.toString(sortedar));

        sortedar = selectionSortWithMinValue(ar) ;
        System.out.println("Sorted with min value " + Arrays.toString(sortedar));
    }

    public static int[] selectionSortWithMaxValue(int[] arr)
    {
        int max = 0;
        int n = arr.length ;
        for (int i = 0; i < n-1; i++) // loop for all elements
        {
            max = i; // assume maximum value is the first element
            for(int j = i+1; j < n ;j++) // loop for changing the max value
            {
                if (arr[max] < arr[j])
                {
                          max = j ;
                }
            }
            // swap max value with arr[i]
            int temp = arr[i];
            arr[i] = arr[max];
            arr[max] = temp ;

        }
        return  arr ;
    } // end selectionSortWithMaxValue

    public static int[] selectionSortWithMinValue(int[] arr)
    {
        int min = 0 ;
        int n = arr.length ;
        for (int i = 0; i < n; i++)
        {
            min = i ; // assume min value is the first element
            for(int j= i+1 ; j < n-1 ; j++)
            {
                if (arr[j] < arr[min])
                {
                    min = j ;
                }
            }
            // swap the min value as the inner loop decide the minimum value of the array in min (as index)
            int temp = arr[i] ;
            arr[i] = arr[min];
            arr[min] = temp ;

        }
        return arr ;


    } // end selecitonsort

}
