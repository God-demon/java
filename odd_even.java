import java.util.Scanner;

import java.util.concurrent.TimeUnit;

/**
 * odd_even
 */
public class odd_even {
  
  public static void main(String[] args) {

    String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        String GREEN = "\u001B[32m";
        String YELLOW = "\u001B[33m";

    int input;

    System.out.print("Enter any Number : ");

    Scanner s = new Scanner(System.in);

    input = s.nextInt();
    
   for (int i = 1; i < input; i++) {

      if (i/2 == 0) {

        System.out.println(GREEN + i +" "+RED+" is Even Number" + RESET);
        
      } else {

        System.out.println(i + " "+"Odd Number");

      }
    
   }


  }
  
}
