package Array;
import java.util.*;

public class array1 {

    public static void main(String args[])
    {
        int arr[] = {10,20,30,50,40};

       // with the help of for each loop
        
        // for(int e:arr)
        // {
        //     System.out.println(e);
        // }


        // with the help of for loop


        // for(int i=0;i<arr.length;i++)
        // {
        //     System.out.println(arr[i]);

        // }


        outputArray(inputArray());

    }

    static int[] inputArray()
    {
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int [] intArray =new int[n];
        for(int i=0;i<n;i++)
        {
           System.out.println("Enter " + i + " Element in an array");
           intArray[i] = sc.nextInt();
        }
        sc.close();
        return intArray;
    }

    static void outputArray(int[] intArray)
    {
        for(int i=0;i<intArray.length;i++)
        {
            System.out.println(intArray[i]);
        }
    }
    
}
