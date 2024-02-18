public class ReverseArray {
    
    public static void reverse(int arr[])
    {
      int low = 0,high = arr.length-1,temp;
      while(low<high)
      {
         temp = arr[low];
         arr[low]=arr[high];
         arr[high]=temp;
         low++;
         high--;
      }
    }

    public static void main(String args[])
    {
        int arr[]={10,20,5,30};
        reverse(arr);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
