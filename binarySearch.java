public class binarySearch {
    
    public static void main(String args[])
    {
        int arr[]= {5,10,15,20,35};
        int target = 70;

        // int result = binarySearchI(arr,target);
        int result = binarySearchR(arr,target,0,arr.length-1);

        if(result != -1)
        {
            System.out.println("Element at index "+ result);
        }
        else
        {
            System.out.println("Element not found");
        }

    }

    public static int binarySearchI(int arr[],int target)
    {
        int start = 0;
        int end= arr.length-1;
        

        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid]> target)
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }

    public static int binarySearchR(int arr[],int target,int start, int end)
    {
        if(start<=end)
        {
            int mid = start+(end-start)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(arr[mid] < target)
            {
                return binarySearchR(arr,target,mid+1,end);
            }
            else
            {
                return binarySearchR(arr,target,start,mid-1);
            }
        }
        return -1;
    }
}
