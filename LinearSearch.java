
/**
 * LinearSearch
 */
public class LinearSearch {

    public static void main(String args[])
    {
        int arr[]={10,5,20,30,4};
        int target = 20;

        // int result = Linear(arr,target);
        int result = LinearSearchR(arr,target,0);

        if(result != -1)
        {
            System.out.println("Target find on index "+ result);
        }
        else
        {
            System.out.println("Target not found");
        }
    }

    public static int Linear(int arr[],int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    public static int LinearSearchR(int arr[],int target,int index)
    {
        if(index>=arr.length)
        {
            return -1;
        }
        if(arr[index] == target)
        {
            return index;
        }
        return LinearSearchR(arr,target,index+1);
    }
}