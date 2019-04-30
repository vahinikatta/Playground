import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int a[]=new int[s];
      for(int i=0;i<s;i++)
        a[i]=in.nextInt();
      int e1=in.nextInt();
      int e2=in.nextInt();
      int a1=0,a2=0;
      for(int i=0;i<s;i++)
      {
        if(e1==a[i])
        {
          a1=1;
          System.out.println(i);
        }
         else if(e2==a[i])
         {
           a2=1;
          System.out.println(i);
         }
      }
      if(a1==0)
        System.out.println("-1");
      else if(a2==0)
        System.out.println("-1");
        
    }
}