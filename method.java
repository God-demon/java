

public class method {
  
 static void add() {
    int a = 10 , b = 30 ;
    System.out.println(a+b);
  }

  public static void main(String[] args) {
    
    method foo = new method();

    method.add();

    foo.message();


  }


  void message() {
    System.out.println("Hi I am Method");
    method.add();
  }


}
