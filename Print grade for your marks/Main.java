import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner scanner = new Scanner(System.in);
		
          int avg = scanner.nextInt();
        
        if(avg>=85)
        {
            System.out.print("A");
        }
        else if(avg>=75)
        {
           System.out.print("B");
        } 
        else if(avg>=65)
        {
            System.out.print("C");
        }
        else if(avg>=55)
        {
            System.out.print("D");
        }
      else if(avg>=45)
        System.out.print("E");
      else
        System.out.print("Fail");
    }
}