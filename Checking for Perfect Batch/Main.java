import java.util.Scanner;
class Main
{
  public static void batch(int a[],int n)
  {
     int x= a[0]+a[2]+a[1];
    boolean flag=false;
    int i=3;
    while(i<n-2)
    {
      if((a[i]+a[i+1]+a[i+2])==x)
        flag=true;
      i=i+3;
    }
    if(flag==true)
      System.out.print("Perfect Batch");
    else
    System.out.print("Not a Perfect Batch");
  }
  public static void main(String args[])
  {
    //Try your code here
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int a[]=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    batch(a,n);
  }
}