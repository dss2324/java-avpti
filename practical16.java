public class practical16 {
    static class station {
        void dis()
        {
            System.out.println("this train is panchvati");
        }
    }
    static class destination extends station{
        void place()
        {
            System.out.println("the destination is Ayodhya");
        }
    }
    static class greeting extends station{
        void greet()
        {
            System.out.println("thankyou for visiting");
        }
    }
    public static void main(String[] args)
    {
        greeting g=new greeting();
        g.dis();
        g.greet();
    }
}
