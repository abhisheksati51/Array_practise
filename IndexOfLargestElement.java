public class IndexOfLargestElement {
    
    public static void LargestElementIndex(int arr[])
    {
        int largest = 0;
        int index =0;
        for(int i=0;i<arr.length;i++)
        {
              if(largest < arr[i])
              {
                   largest = arr[i];
                   index = index+1;
              }
        }
        System.out.println(largest + " "+index);
    }


    public static int SecondLargest(int arr[])
    {
        int max1 = 0,max2 =0;

        if(arr[0]>arr[1])
        {
            max1 = arr[0];
            max2 = arr[1];
        }
        else
        {
            max1 = arr[1];
            max2 = arr[0];
        }

        for(int i=2;i<arr.length;i++)
        {
            if(max1<arr[i])
            {
                max2 = max1;
                max1 = arr[i];
            }
            else if(max2<arr[i])
            {
                max2 = arr[i];
            }
        }
        return max2;
    }

    public static void main(String args[])
    {
     int arr[]={40,8,50,100};
     int SecondLargest = SecondLargest(arr);
     System.out.println(SecondLargest);

    }
}
