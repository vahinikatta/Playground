import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int flag=0;
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
    a[i][j]=in.nextInt();
    int b[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
    b[i][j]=in.nextInt();
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
    if(a[i][j]==b[i][j])
     flag=1;
    else flag=0;
if(flag==1)
      System.out.print("Yes");
    else
      System.out.print("No");
  }
}