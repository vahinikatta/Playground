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
    int max=0,sub=0,sum=a[0];
    for(int i=1;i<n;i++)
    {
      if(a[i]>a[i-1])
        sum=sum+a[i];
      else
      {
        if(sum>sub)
        sub=sum;
        sum=a[i];
      }
    }
    System.out.print(sum);
  }
}