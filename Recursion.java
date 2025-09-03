public class Recursion
{
    public static void main(String[] args)
    {
        int result = factorial(10);
        System.out.println(result);
    }
    public static int factorial(int i)
    {

        int result = 1;
        if (i > 0)
        { // 4! = 4 * (4-1)! .......
            result = i * factorial(i-1);
        }
            return result ;
        /*
        factorial with for-loop
        int result = 1 ;
        for (int j = i; j >0  ; j--)
        {
            result *= j    ;
        }
        System.out.println(result);
        */
    } // end factorial


} // end class
