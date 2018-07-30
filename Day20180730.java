import java.lang.*;
class Day20180730
{   
    //java.util.Arrays definds the method Array.sort() can be used in developing.
    //selectSort 
    public static void selectSort(int[]arr)
    {
        for(int x=0;x<arr.length-1;x++)
        {
            for(int y=x+1; y<arr.length;y++)
            {
                if(arr[x]>arr[y])
                {
                    int temp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = temp;
                }
            }
        }
    }
    
    //bubbleSort
    public static void bubbleSort(int[] arr)
    {
        for(int x = 0;x<arr.length-1;x++)
        {
            for(int y=0;y<arr.length-1-x;y++)
            {
                if(arr[y]>arr[y+1])
                {
                    int temp = arr[y];
                    arr[y] = arr[y+1];
                    arr[y+1] = temp;
                }
            }
        }
    }
    
    //java.util.Arrays definds the method Array.binarySearch() can be used in developing.
    //serch
    public static int normalSearch(int[] arr,int key)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==key)
                return i;
        }
        return -1;
    }
    
    //binarySearch
    //input:array which is sorted
    //output:return the index of the key;if key is not found,return -1
    public static int binarySearch(int[]arr,int key)
    {
        int max,min,mid;
        min=0;
        max=arr.length-1;
        
        while(min<=max)
        {
            mid=(max+min)>>1;
            if(key>arr[mid])
                min=mid+1;
            else if(key<arr[mid])
                max=mid-1;
            else
                return mid;
        }
        return -1;
    }
    
    //进制转换
    //java.util.Integer definds the method Integer.toBinaryString() can be used in developing.
    //                                     Integer.toHexString()
    //                                     Integer.toOctalString()
    //eg.tranfer from decimal 60 to octal: trans(60,8,3)
    public static String trans(int num,int base,int offset)
    {
        if(num==0)
        {
            System.out.print("0");
            return "0";
        }
        char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};//查表法
        char[] crr= new char[32/offset+((32%offset==0)?0:1)];
        int pos=crr.length;
        while(num!=0)
        {
            int temp = num & (base-1);
            crr[--pos]=chs[temp];
            num = num >>> offset;
        }
        return String.valueOf(crr,pos,crr.length-pos);
    }
    
    public static String tobin(int num)
    {
        return trans(num,2,1);
    }
    public static String tooct(int num)
    {
        return trans(num,8,3);
    }
    public static String tohex(int num)
    {
        return trans(num,16,4);
    }
    /*
    public static void toHex(int num)
    {
        if(num==0)
        {
            System.out.print("0");
            return ;
        }
        char[] chs={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        char[] crr= new char[8];
        int pos=crr.length;
        while(num!=0)
        {
            int temp = num & 15; //15in hex: 0000-0000 0000-0000 0000-0000 0000-1111
            crr[--pos]=chs[temp];
            num = num >>> 4;
        }
        for(int i=pos;i<crr.length;i++)
            System.out.print(crr[i]);
    }
    
    public static void toBin(int num)
    {
        if(num==0)
        {
            System.out.print("0");
            return ;
        }
        char[] chs={'0','1'};
        char[] crr= new char[32];
        int pos=crr.length;
        while(num!=0)
        {
            int temp = num & 1;
            crr[--pos]=chs[temp];
            num = num >>> 1;
        }
        for(int i=pos;i<crr.length;i++)
            System.out.print(crr[i]);
    }
    
    public static void toOct(int num)
    {
        if(num==0)
        {
            System.out.print("0");
            return ;
        }
        char[] chs={'0','1','2','3','4','5','6','7'};
        char[] crr= new char[11];
        int pos=crr.length;
        while(num!=0)
        {
            int temp = num & 7;
            crr[--pos]=chs[temp];
            num = num >>> 3;
        }
        for(int i=pos;i<crr.length;i++)
            System.out.print(crr[i]);
    }
    */
    //this method is used to print the array
    public static void arrPrint(int[] arr)
	{
		System.out.print("[");
		for(int i=0;i<arr.length;i++)
		{
			if (i==arr.length-1)
			{
				System.out.println(arr[i]+"]");
			}
			else
				System.out.print(arr[i]+",");
		}
	}
    
    public static void main(String[] args)
    {
        int[] arr = new int[]{53,-16,-7,86,45,-59,34};
        //selectSort(arr);
        bubbleSort(arr);
        arrPrint(arr);
    
        int[] brr = {10,25,34,59,68,74,85,94};
        System.out.println(binarySearch(brr,59));
        System.out.println(normalSearch(brr,59));

        System.out.print("bin 60:");
        System.out.println(tobin(60));
        System.out.print("oct 60:");
        System.out.println(tooct(60));
        System.out.print("hex 60:");
        System.out.println(tohex(60));
        System.out.print("trans 60:");
        System.out.print(trans(60,16,4));
        System.out.println();
        System.out.println(tooct(-60));
        System.out.println(Integer.toOctalString(-60));
    }
}