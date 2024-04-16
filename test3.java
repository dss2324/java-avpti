public class test3 {
    public static void main(String[] args) {
        int num = 123;
        int sum=0,rem=0;
        while(num>0)
        {
            rem = num%10;
            sum=sum+rem;
            num=num/10;
        }
        //System.out.println(sum);



        int num2=123;
        int rem2=0,rev=0;
        while(num2>0)
        {
            rem2=num2%10;
            rev=rev*10+rem2;
            num2=num2/10;
        }
        System.out.println(rev);
        

    }
}
