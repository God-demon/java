import java.util.Scanner;

class Table extends console_color {

public static void main(String[] args) {
  
    int input;

    console_color c = new console_color();

    System.out.print("Enter Your Tabel Number ");

    Scanner s = new Scanner(System.in);

    input = s.nextInt();

    for (int i = 1; i <= 10; i++) {

      System.out.println(c.CYAN_BOLD_BRIGHT + input + " " + "*" + " " + i + " " + "=" + " " + input * i + c.RESET);
      
    }



}


}

