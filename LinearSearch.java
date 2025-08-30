

public class LinearSearch
{
    //  Linear Search Algo
    // search element one by one with for loop
    // Time Complexity = O(n)
    public static void main(String[] args)
    {
        // sorted or unsorted array {no duplicates}
        int ar1[] = {11,66,5,9,4,2,25,37,19,67,45,20,18,54,53,79,32};
        int ar2[] = {1,2,3,5,6,7,8,9,10,15,18,19,20,25,27,29,30,35,36,38,39,40};
        int target = 54;

        int result = linearSearch(ar1, target);  // returning the index of the target
        if (result != -1)
            System.out.println("Target found at index: " + result);
        else
            System.out.println("Target Not Found !");
    }
    public static int linearSearch(int[] arr, int target)
    {
        for (int i = 0 ; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1 ;
    }

}
