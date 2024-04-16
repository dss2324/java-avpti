class add
{    
    public int x;
    public add()
    {
        System.out.println("simple constructor is called");
    }
    public add(int x)
    {
        System.out.println("parametrized constructor is called");
        this.x=x;
        System.out.println("value of x in parametrized constructor is "+x);
    }
    public add(add addobj)
    {
        System.out.println("copy constructor is called");
        x=addobj.x;
        System.out.println("value of x in copy constructor is called "+x);
    }
    public int Add(int a,int b)
    {
        return a+b;
    }
    public int Add(int a,int b,int c)
    {
        return a+b+c;
    }
    public String Add(String a,String b)
    {
        return a+b;
    }
}
public class test2 {
    public static void main(String[] args) {
        //  add obj=new add();
        //  add obj1=new add(3);
        //  add obj2=new add(obj1);
        //  //new syntax for wrapper class
        //  Integer myint = 5;
        //  int a=8;
        //  System.out.println(myint.intValue()+a);
        //  //old syntax for wrapper class
        //  //Integer myint= new Integer(33);
        String str= "apple banna mango";
        String arrayofsubstr[]=str.split(" ");
        for(String i:arrayofsubstr)
        {
            System.out.println(i);
        }
    }
}
