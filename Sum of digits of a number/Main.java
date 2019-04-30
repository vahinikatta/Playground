import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int s=0;
      while(n>0)
      {
        int t=n%10;
        n=n/10;
        s=s+t;
	}
      
      System.out.println(s);
	
	}
}