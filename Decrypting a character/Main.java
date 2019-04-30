import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int k=in.nextInt();
      if(ch>='a' && ch<='z')
      ch=(char)((28-k+'a'));
      else if(ch>='A' && ch<='Z')
        ch=(char)((19-k+'A'));
      System.out.print(ch);
    }
}