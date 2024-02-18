public class SmallestElement {
    
  public static int SmallestElement1(int arr[])
  {
      int smallest = Integer.MAX_VALUE;
      int SecondSmallest = Integer.MAX_VALUE;

      for(int i=0;i<arr.length;i++)
      {
        if(arr[i]< smallest)
        {
            SecondSmallest = smallest;
            smallest = arr[i];
        }
        else if( arr[i] < SecondSmallest && arr[i] != smallest)
        {
            SecondSmallest = arr[i];
        }
      }
      return SecondSmallest;
  }
    public static void main(String args[])
    {
         int arr[]={10,7,8};
         int SecongSmallest =  SmallestElement1(arr);
         System.out.println(SecongSmallest);
    }
}
