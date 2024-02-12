public class practical2 {
    public static void main (String[] args){
        int x=10;
        int z=15;
        int y=5;
        if (x>y && x>z)
        {
            System.out.println("x is max");
        }

        else{
            if(y>z){
                System.out.println("y is max");
            }
            else{
                System.out.println("z is max");
            }
        }
    }
}
