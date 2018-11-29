public class insertionSort {
    public static void insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for (int j = i; j >= 0; j--)
            {
                if(arr[j] > arr[j-1])
                {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
                else
                {
                    j = 0;
                }
            }
        }
    }
}
