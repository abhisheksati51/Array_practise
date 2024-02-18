public class LeaderArray {

    // time complexity is 0(n*n)
    public static void  Leader(int arr[])
    {
      for(int i=0;i<arr.length;i++)
        {
             boolean is_leader = true;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] >= arr[i])
                {
                    is_leader = false;
                    break;
                }
            }
            if(is_leader == true)
            {
                System.out.println(arr[i]);
            }
        }
    }

    // time complexity of 0(n)

    public static void isLeader(int arr[])
    {
        int n = arr.length-1;
        int curr_leader = arr[n];
        System.out.println(curr_leader);

        for(int i= n-1 ; i>=0;i--)
        {
            if(arr[i]>curr_leader )
            {
                curr_leader = arr[i];
                System.out.println(curr_leader);
            }
        }
    }

    public static void MaxDiff(int arr[])
    {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                int diff = arr[j] - arr[i];

                if( max < diff)
                {
                    max = diff;
                }
            }
        }
        System.out.println(max);
    }

    public static int Diff_Max(int arr[])
    {
        int res = arr[1] - arr[0];
        int min = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            res = Math.max(res,arr[i]-min);
            min = Math.min(min,arr[i]);
        }
        return res;
    }
    public  static void main(String args[])
    {
        int arr[]={30,10,20};
        // Leader(arr);
        //isLeader(arr);
        int diff= Diff_Max(arr);
        System.out.println(diff);

       
    }
}
