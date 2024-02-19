public class practical11 {

    static class shape{
        double area(float radius)
        {
            return 3.14*radius*radius;
        }
         double area(float length, float width)
         {
            return length*width;
         }

    }
    public static void main(String[] args)
    {
        shape s1= new shape();
        
        shape s2=new shape();
        System.out.println(s1.area(5));
        System.out.println(s2.area(2,3));

    }
}
