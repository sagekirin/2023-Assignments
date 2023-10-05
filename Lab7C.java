import java.util.Scanner;

public class Lab7C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Please enter a value for the size: ")
      int size = sc.nextInt();

    System.out.println("This is the requested " + size + "x" + size + " right-triangle:");

    for (int i = 1; i <= size; i++) { //Columns
      for (int j = 1; j >= i; j--) { //Stars appear in reverse, then slowly disappear from the bottom
        System.out.print("*") 
      }
      System.out.println();
    }
  }
}
