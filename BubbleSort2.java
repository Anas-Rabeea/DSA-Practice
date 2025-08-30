import java.util.Arrays;

public class BubbleSort2
{
    public static void main(String[] args)
    {
        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        int[] sortedar = bubbleSort(ar) ;
        System.out.println(Arrays.toString(sortedar));
    } // end main

    public static int[] bubbleSort(int[] arr)
    {
        int n = arr.length ;
        int temp = 0;
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n - i - 1 ; j++)
            {
                // swap if bigger
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;
                }
            }
        }



    return arr ;
    } // end bubbleSort

}
