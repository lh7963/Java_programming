/*
二维数组

*/
class Day20180801
{
    public static void main(String[] args)
    {
        //格式1
        int[][] arr = new int[3][2];
        System.out.println(arr);
        System.out.println(arr[0]);
        System.out.println(arr[0][0]);
        //格式2
        int[][] brr = new int[3][];
        brr[0] = new int[2];
        brr[2] = new int[3];
        System.out.println(brr[2][2]);
        System.out.println(brr[1]);
        //格式3
        int[][] drr = {{3,1,7},{5,8,2,9},{4,1}};
        
        //遍历_
        for(int i=0;i<drr.length;i++)
        {
            System.out.print("[");
            for(int j=0;j<drr[i].length;j++)
            {
                if(j==drr[i].length-1)
                    System.out.print(drr[i][j]);
                else
                    System.out.print(drr[i][j]+",");
            }
            System.out.println("]");
        }
    }
}