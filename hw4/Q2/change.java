import java.util.Scanner;
import java.util.Arrays;
public class change
{
    public static int[] bubbleSortEfficient(int A[], int size)
    {
        int temp;
        boolean exchanged = true;
        for (int i = 0; ((i < size) && (exchanged)); i++)
        {
            exchanged = false;
            for (int j = size - 1; j >= i + 1; j--)
            {
                if (A[j] < A[j - 1])
                {
                    temp = A[j];
                    A[j] = A[j - 1];
                    A[j-1] = temp;
                    exchanged = true;
                }
            }
        }
        return A;
    }
}