public class RotateAnArray {
    

    public static void rotate(int arr[],int k)
    {
        k= k%arr.length;
       rotate1(arr,0,arr.length-1);
       rotate1(arr,0,k-1);
       rotate1(arr,k,arr.length-1);
    }

    public static void rotate1(int arr[],int start, int end)
    {
        while(start<end)
        {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5,6,7};

        for(int i=0;i<arr.length;i++)
        {
         System.out.print(arr[i]+" ");
        }   
        System.out.println();
    rotate(arr,3);
    for(int i=0;i<arr.length;i++)
    {
     System.out.print(arr[i]+" ");
    }   

 }
}
