public class practical14 {
    static class student{
        void display()
        {
            System.out.println("hello");
        }
    }
    static class info extends student{
        void disply2()
        {
            System.out.println("hello world");
        }
    }
    public static void main(String[] args)
    {
        info i=new info();
        i.display();
        i.disply2();
    }
}
