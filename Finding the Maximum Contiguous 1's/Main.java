import java.util.Scanner;
public class Main
{
    public static void main(String args[])
    {
    	// type your code here
      Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
      int c=0,b=0;
      for(int i=0;i<n;i++)
      {
        if(a[i]==1)
        {
          c++;
        }
        else
        {
          if(c>b)
          b=c;
          c=0;
        }
      }
      System.out.print(b);
    }
}