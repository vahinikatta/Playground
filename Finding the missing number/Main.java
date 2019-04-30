import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
         a[i]=in.nextInt();
      int b[]=new int[n+1];
      for(int i=0;i<n;i++)
         b[i+1]=0;
      for(int i=0;i<n;i++)
      {
        int t=a[i];
        b[t]=1;
      }
      for(int i=0;i<n;i++)
      {
        if(b[i+1]!=1)
          System.out.print(i+1);
      }
          
    }
}