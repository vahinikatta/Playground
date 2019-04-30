import java.util.Scanner;
class Main{
  public static void sum(int n,int a[],int v)
  {
    for(int i=0;i<n;i++)
    {
      for(int j=i+1;j<n;j++)
      {
        if(a[i]+a[j]==v)
          System.out.println(a[i]+", "+a[j]);
      }
    }
  }
    public static void main(String args[]) {
      // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int val=in.nextInt();
      sum(n,a,val);
    }
}