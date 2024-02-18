public class removeDuplicate {
    
  public static int removeDuplicate1(int arr[])
  {
      int res =0;

      for(int i=1;i<arr.length;i++)
      {
        if(arr[res] != arr[i])
        {
            res++;
            arr[res] = arr[i];
        }
      }
      return res+1;
  }
    public static void main(String argd[])
    {
        int arr[] = {2,2,3,3,4,5,6};

        int rd = removeDuplicate1(arr);

         for(int i=0;i<rd;i++)
         {
            System.out.print(arr[i]+" ");
         }
    }
}
