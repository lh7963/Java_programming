/**
 * build a tool class including the operation methods such as "find the maximum", "sort an array".
 * @author linhan_
 * @version v1.0
 */
 //javadoc -d doc -encoding GBK -charsetGBK ArrayTool.java
public class ArrayTool {
	private ArrayTool() {};
	public static int getMax(int[] arr)
	{
		/**
		 * get the maximum element in the array
		 * @param arr input a reference of an array
		 * @return output the maximum element
		 */
		int max=arr[0];
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
	/**
	 * sort an int array
	 * @param arr input a reference of an int array
	 */
	public static void selectSort(int[] arr)
	{
		for(int x=0;x<arr.length-1;x++)
		{
			for(int y=x+1;y<arr.length;y++)
			{
				if(arr[x]>arr[y])
					swap(arr,x,y);
			}
		}
	}
	/**
	 * change the position of the element in an array
	 * @param arr input a reference of an int array
	 * @param a the index of the element1
	 * @param b the index of the element2
	 */
	private static void swap(int[] arr,int a,int b)
	{
		int temp=arr[a];
		arr[a]=arr[b];
		arr[b]=temp;
	}
	/**
	 * get the index of the "key" element 
	 * @param arr input a reference of an int array
	 * @param key the element you want to find
	 * @return the index of the first appearance of the key element, if not return -1
	 */
	public static int getIndex(int[] arr,int key)
	{
		for(int x=0;x<arr.length;x++)
		{
			if(arr[x]==key)
				return x;
		}
		return -1;
	}
	/**
	 * represent the int array with a string with format:[e1,e2...]
	 * @param arr input a reference of an int array
	 * @return return the string
	 */
	public static String arrayToString(int[] arr)
	{
		if(arr.length==0)
		{
			return "[]";
		}
		String str="[";
		for(int i=0;i<arr.length;i++)
		{
			if(i==arr.length-1)
			{
				str=str+arr[i];
			}
			else
			{
				str=str+arr[i]+",";
			}
		}
		return str+"]";
	}
}

