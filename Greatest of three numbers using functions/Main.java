import java.util.Scanner;
class Main{
  public static int great(int n1,int n2,int n3)
  {
    if(n1>=n2 && n1>=n3)
      return n1;
    else if(n2>=n1 && n2>=n3)
      return n2;
    else 
      return n3;
  }
       
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      System.out.println(great(n1,n2,n3));
	}
}