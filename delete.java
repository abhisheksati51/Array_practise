

public class delete {
    

    public static void main(String args[])
    {
        int arr[]={10,20,30,40,50};

        int del =60;
        int count =0;
        for(int i=0;i<arr.length;i++)
        {
            if(del == arr[i])
            {
                    for(int j = i;j<arr.length-1;j++)
                    {
                         arr[j] = arr[j+1];
                    }
                    count = count+1;
                    break;
            }
        }

        if(count == 0)
        {
            System.out.println("Element is not found in an array");
        }
        else
        {
            System.out.println("Element is deleted Successfully");
            for(int i=0;i<arr.length-1;i++)
            {
                System.out.print(arr[i]+" ");
            }
        }

    }
}
