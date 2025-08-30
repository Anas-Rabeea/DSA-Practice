public class BinarySearch
{

    public static void main(String[] args)
    {
        // Binary search Algorithm
        // The Array Must be Sorted
        // Time Complexity = O(Log(n)) where n is the number of elements
        // int ar1[] = {11,66,5,9,4,2,25,37,19,67,45,20,18,54,53,79,32};
        int ar2[] = {1,2,3,5,6,7,8,9,10,15,18,19,20,25,27,29,30,35,36,38,39,40,45};
        int target = 38;
        // dealing with indexes
        int resultIndex = binarySearch(ar2 , target) ; // returning the index of the result
        if (resultIndex != -1)
            System.out.println("Target Found at index : " + resultIndex);
        else
            System.out.println("Target Not Found !");

    }
    public static int binarySearch(int[] ar , int target)
    {
        int start = 0 ;
        int end = ar.length - 1 ;
        int mid = (int) ((start+end) /2) ; // inedx of mid
        int steps = 0 ;
        while (start <= end)
        {
            mid = (int) ((start+end) /2) ;
            if (ar[mid] == target) {
                return mid;
            }
            else if (ar[mid] < target)
            {
                start = mid +1 ;
            }
            else
            {
                end = mid - 1 ;
            }
        }
        return -1 ;
    }

}
