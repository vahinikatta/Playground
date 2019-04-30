import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=0;
      int t=n;
      while(n>0)
      {
        int f=1;
      for(int i=1;i<=n%10;i++)
      {
        f=f*i;
      }
        n=n/10;
     s=s+f;
      }
      if(s==t)
           System.out.println("Yes");
      else
        System.out.println("No");

	}
}