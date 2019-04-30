import java.util.Scanner;
class Main{
  public static void subset(int n,int a[])
  {
    for(int i=0;i<n-2;i++)
    {
      for(int j=i+1;j<n-1;j++)
      {
        for(int k=j+1;k<n;k++)
          System.out.print("("+a[i]+", "+a[j]+", "+a[k]+") ");
      }
      System.out.println();
    }
    System.out.println();
  }
    public static void main(String args[]) {
       // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      subset(n,a);
    }
}