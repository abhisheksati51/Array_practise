public class LeftRotateArray {
    
    public static void leftRoatate(int arr[])
    {
        int size = arr.length;
        int temp = arr[0];

        for(int i=1;i<size;i++)
        {
            arr[i-1] = arr[i];
        }
        arr[size-1] = temp;
    }

    public static void leftRoatateA(int arr[],int  d)
    {
        for(int i=0;i<d;i++)
        {
            leftRoatate(arr);
        }
    }

    public  static  void main(String args[])
    {
      int arr[] ={1,2,3,4,5};
    
      leftRoatateA(arr,2);
      
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }


}
