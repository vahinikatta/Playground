import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int c=0;
    int b[]=new int[10];
    for(int i=0;i<10;i++)
      b[i]=0;
    for(int i=0;i<n;i++)
    {
      int t=a[i];
      b[t]++;
    }
    int x=0;
    for(int i=0;i<n;i++)
    {
      int t=a[i];
      c=b[t];
      if(c>x)
        x=a[i];
        
    }
    System.out.print(x);
    
  }
}