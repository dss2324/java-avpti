public class practical12 {
    static class person{
        private String name;
        private int age;
        public person()
        {
            name="unknown";
            age=0;
        }
        public person(String name)
        {
            this.name=name;
            System.out.println(this.name);
        }
        public person(String name, int age)
        {
            this.name=name;
            this.age=age;
            System.out.println(this.name+" "+this.age);
        }
    }
    public static void main(String[] args)
    {
        person p1=new person();
        person p2=new person("darshana");
        person p3=new person("darshana",18);
        
    }
}
