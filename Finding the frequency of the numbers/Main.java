import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
     	// Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int k=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<n;i++)
        a[i]=in.nextInt();
      int b[]=new int[10];
      for(int i=0;i<10;i++)
        b[i]=0;
      for(int i=0;i<n;i++)
      {
        int t=a[i];
        b[t]++;
      }
      for(int i=1;i<=k;i++)
      {
        
        
        System.out.println(i+" "+b[i]);
        
      }
    }
}