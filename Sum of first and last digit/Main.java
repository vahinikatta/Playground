import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int r=n%10;
      while(n>9)
        n=n/10;
      int s=n+r;
System.out.println(s);
	}
}