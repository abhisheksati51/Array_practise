public class arr2 {
    
    public static void main(String args[])
    {

    int n = find();
  System.out.println(n);


       
    }
    public static int find()
    {
        int arr[] = {6,7,8,4,1};
        int num =9;

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i] == num)
            {
                return i;
            }
        }
        return -1;
    }
}
