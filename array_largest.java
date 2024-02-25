import java.util.Scanner;

public class array_largest {

  public static void main(String[] args) {
    
    int array[] = new int[5]; int check;

    Scanner s = new Scanner(System.in);

    for (int i = 0; i < array.length; i++) {

      array[i] = s.nextInt();

    }

    check = array[0];

    for(int i = 1 ; i < array.length ; i++) {
      if (array[i] > check) {

        check = array[i];
        
      }
    }

    System.out.println("\n"+check);

  }
  
}
