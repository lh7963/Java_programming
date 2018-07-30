
public static void selectSort(int[] arr)
{
    for(int x=0;x<arr.length-1;x++)
    {
        if(arr[x]>arr[y])
        {
            int temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
    }
}
