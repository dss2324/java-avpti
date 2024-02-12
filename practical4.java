public class practical4 {
    public static void main(String[] args)
    {
        int arr1[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr2[][]={{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.println(arr1[i][j] + arr2[i][j]);
            }
        }
    }
}
