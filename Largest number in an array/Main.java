import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int s=in.nextInt();
      int a[]=new int[s];
      for(int i=0;i<s;i++)
        a[i]=in.nextInt();
      int l=a[0];
      for(int i=1;i<s;i++)
      {
        if(l<a[i])
        {
          l=a[i];
        }
      }
        System.out.println(l);
        
    }
}