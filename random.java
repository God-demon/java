import java.util.Random; // this is a Header File For Random

public class random {
  public static void main(String[] args) {
    
    Random r = new Random();  // This ie Refrence of a Class r is object of a Random class

    int x = r.nextInt(3)+1; // There we add r.nextInt() because We want integer Value from Random class and 3 was a range or + 1 means we start the Random Number at 1 

    System.out.println(x);
  }
}
