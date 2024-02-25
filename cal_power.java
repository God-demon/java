
import java.util.Scanner;

  
public class cal_power extends console_color {
  
  public static void main(String[] args) {

    int input , input2;

    System.out.println("");

    console_color c = new console_color();

    System.out.print(c.GREEN_BOLD + "Enter Your Power Number : " + c.RESET);

    Scanner s = new Scanner(System.in);

    input = s.nextInt();

    System.out.println("");

    System.out.print(c.GREEN_BOLD_BRIGHT + "Enter Your Power : " + c.RESET);

    input2 = s.nextInt();

    int number = 1;

    System.out.println("");

    for (int i = 1; i <= input2; i++) {
      
      number = input * number;

    }

    System.out.println(c.CYAN_BOLD + number + c.RESET);    
    System.out.println("");

  }


}
