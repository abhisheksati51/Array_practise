public class Sorted {
    
  public static Boolean isSorted(int arr[])
  {
    for(int i=1;i<arr.length;i++)
    {
        if(arr[i]<arr[i-1])
        {
            return false;
        }
    }
    return true;
  }
    public static void main(String argd[])
    {
        int arr[] ={10,20,30,40,50};
        // Boolean isSorted = true;
        // for(int i=0;i<arr.length-1;i++)
        // {
        //     for(int j=i+1;j<arr.length;j++)
        //     {
        //          if(arr[i]>arr[j])
        //          {
        //             isSorted = false;
        //          }
        //     }
        // }
        // System.out.println(isSorted);

        boolean Sorted =  isSorted(arr);
        System.out.println(Sorted);
    }
}
