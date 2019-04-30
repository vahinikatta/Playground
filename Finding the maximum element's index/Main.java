import java.util.Scanner;
class Main
{
  public static int max(int a[],int n)
  {
    int x=0,l=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>l)
      {
        x=i;
        l=a[i];
      }
    }
    return x;
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    System.out.print(max(a,n));
  }
}