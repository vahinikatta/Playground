import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
     Scanner in=new Scanner(System.in);
    String s=in.nextLine();
    String w=in.nextLine();
    StringBuilder sb=new StringBuilder(s);
    StringBuilder t=new StringBuilder(w);
    int l=s.length();
    for(int i=0;i<w.length();i++)
    {
      for(int j=0;j<l;j++)
      {
        if(t.charAt(i)==sb.charAt(j) && t.charAt(i)!=' ')
        {
          for(int k=j;k<l-1;k++)
          {
            sb.setCharAt(k,sb.charAt(k+1));
          }
          l--;
        }
        
        
      }
    }
    for(int i=0;i<l;i++)  
    System.out.print(sb.charAt(i));
  }
}