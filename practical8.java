public class practical8 {
    static class rectangle{
        int length;
        int width;
       public rectangle(int l,int w)
       {
            this.length=l;
            this.width=w;
            System.out.println(length*width);
       }
    }

    public static void main(String[] args)
    {
        rectangle r1=new rectangle(4,5);
    }
}
