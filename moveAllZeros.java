

public class moveAllZeros {
    

    public static void moveAllZeros1(int arr[])
    {
        int size = arr.length;

        if(size == 0 || size==1)
        {
            return;
        }
        int nz =0 ,z =0;
        while(nz<size)
        {
            if(arr[nz]!=0)
            {
                int temp= arr[nz];
                arr[nz] = arr[z];
                arr[z]=temp; 
                z++;
                nz++;
            }
            else
            {
                z++;
            }
        }
       

    }
    public static void main(String args[]) {
        int arr[] = {10, 20, 0, 0, 8, 0};

        moveAllZeros1(arr);
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
