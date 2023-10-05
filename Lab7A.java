import java.util.Scanner;

public class Lab7A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a value for the size: ")
      int size = sc.nextInt();

    System.out.println("This is the requested " + size + "x" + size + " box:");

    for (int i = 1; i <= size; i++) { //Rows increasing by 1 each time.
      for (int j = 1; j <= size; j++) { //Columns increasing by 1 each time.
        System.out.print("*") //println prints the string out on one line, while print types it out on the same line
      }
      System.out.println();
    }
  }
}
