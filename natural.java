import java.util.Scanner;

public class natural extends console_color{
  public static void main(String[] args) {

    int n;

    console_color c = new console_color();

    System.out.print("Enter Number Of Terms : ");

    Scanner s = new Scanner(System.in);

    n = s.nextInt();
    
    for (int i = 1 ; i <= n ; i++) {
      
      System.out.println(c.CYAN + i + c.RESET);
      
    }

    
  }
}

