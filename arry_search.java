import java.util.Scanner;

/**
 * arry_search
 */
public class arry_search extends console_color{

  public static void main(String[] args) {

    console_color c = new console_color();
    
    int array[] = new int[5];

    int search;

    boolean check = false;

    Scanner s = new Scanner(System.in);

    System.out.println(c.GREEN_BRIGHT + "Enter Your Elemnet " + c.RESET);

    for (int i = 0; i < array.length; i++) {

        array[i] = s.nextInt();
      
    }

    System.out.println(c.CYAN_BRIGHT + "This is Your Elemnet You Enter " + c.RESET);

    for (int j = 0; j < array.length; j++) {

      System.out.print(array[j]+" ");
      
    }

    System.out.print(c.BLUE_BRIGHT + "\n Enter Your Elemnet To search From array " + c.RESET);

    search = s.nextInt();

    for (int i = 0; i < array.length; i++) {

      if (array[i] == search) {
         check = true;  
      }
      
    }

    if (check) {

      System.out.println(c.GREEN_BRIGHT + "\n Your Elemnet Found in Array" + c.RESET);
      
    } else {

      System.out.print(c.RED_BOLD + "\n Can't Find Your Elemnet in Array" + c.RESET);
      
    }


  }
  
}
