public class practical3 {
    public static void main(String[] args)
    {
        int n=123;
        int reverse=0;
        int sum=0;
        while (n!=0) {
            reverse=n%10;
            sum=sum*10+reverse;
            n=n/10;
        }
      
    }

}

