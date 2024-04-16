public class test4 {
    public void prime(int n)
    {
        while(n>0)
        {   int count=0;
            int num=2;
            for(int i=1;i<=num;i++)
            {
                if(num%i==0)
                {
                    count++;
                }
            }
            if(count==2)
            {   n--;
                System.out.println(num);
            }

        }
    }
    public static void main(String[] args) {
        
    }
}
