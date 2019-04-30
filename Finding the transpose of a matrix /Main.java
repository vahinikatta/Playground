import java.util.Scanner;
class Main{
  public static void main(String args[]){
    // Type your code here
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int a[][]=new int[r][c];
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        a[i][j]=in.nextInt();
      int b[][]=new int[c][r];
   
    for(int i=0;i<r;i++)
      for(int j=0;j<c;j++)
        b[j][i]=a[i][j];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
        System.out.print(b[i][j]+" ");
    System.out.println();
    }
  }
}