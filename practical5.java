public class practical5 {
 public static void main(String[] args) {
  int n=10,i=3,count,c; 
  if(n>2)
  {
    System.out.println("1");
    System.out.println("2");
  }
  for(count=3;count<=n;i++)
  {
    for(c=2;c<i;c++)
    {
      if(i%c==0)
      break;
    }
    if(c==i)
    {
      System.out.println(i);
      count++;
    }
  }
  }
}