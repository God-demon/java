public class Alphabet extends console_color {
  
  public static void main(String[] args) {

    int n = 1;

    console_color c = new console_color();

    
    for (char i = 'A'; i <= 'Z'; i++) {

      if (n >= 4) {

        System.out.print(c.CYAN + i + c.RESET);

        System.out.print("\n");

        n = 0;
            
      } else {
          
          System.out.print(c.CYAN + i + " " + c.RESET);

      }

      n++;

    }

  }


}
