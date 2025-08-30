import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args)
    {
        /*
           Bubble Sort
           Time Complexity O(n^2)
        */
        int[] ar = {10,6,98,56,34,88,23,57,16,3,8,7,614,357,159,684,257,126,749,689};
        int[] sortedar = bubbleSort(ar) ;
        System.out.println(Arrays.toString(sortedar));
    } // end main
    public static int[] bubbleSort(int[] arr)
    {
        for (int j = 0 ; j < arr.length;j++) {
            for (int i = 0; i < arr.length; i++) {
                if ((i + 1) < arr.length) {
                    int temp = arr[i];
                    if (arr[i] > arr[i + 1]) {
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        return arr;
    }

}
