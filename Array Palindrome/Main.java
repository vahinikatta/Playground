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
      int l=a[0],r=a[n-1],i=1;
      while(l<r)
      {
        if(a[l]!=a[r])
        {
          i=0;
        break;
        }
            else
            {
          l++;
          r--;
            } 
      }
    // System.out.println(i);
      if(n%2==0)
        System.out.println("Yes");
      else 
        System.out.println("No");
      
    }
}