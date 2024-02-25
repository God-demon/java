import java.util.Scanner;

/**
 * array_sum
 */
public class array_sum {
  
  public static void main(String[] args) {
      
    int array[] = new int[5];

    int sum = 0;

    Scanner s = new Scanner(System.in);

    System.out.println("Enter Your Element Name :");

    for (int i = 0; i < array.length; i++) {
      
      array[i] = s.nextInt();

    }

    for (int i = 0; i < array.length; i++) {
      
      sum = array[i]+sum;      
    }
    System.out.println("your array Addtion is " + sum );


  }
  
}
