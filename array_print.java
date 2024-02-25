
// Print Array using Array Library 

import java.util.Arrays;

public class array_print {

  public static void main(String[] args) {

    int no[] = {1,7,8,99,8,7,7,7,7};

    int bo[][] = {{2,6,5,7} , {5,6,7,7,8}};

    // this is first example of print array

    /*
     
    for(int i : no ) {
      System.out.println(i);
    }

    */


    // this is second example of print array

    System.out.println(Arrays.toString(no));

    // this is third example of print 2d array 

    System.out.println(Arrays.deepToString(bo));

    // this fourth example of print array 

    System.out.println(Arrays.asList(no));

    // asList method is not good for integer array you can use String List to print with asList


  }

}
