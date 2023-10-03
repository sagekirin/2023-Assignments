import java.util.Scanner;

public class Assignment1C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);  //Starting a new scanner

    System.out.println("Enter your third favorite animal: ")  //Getting every variable using best fitting datatype
      String animal = sc.nextLine()
     System.out.println("Enter the subtotal form your last take-out meal: ")
      float s_Totoal = sc.nextFloat();
    System.out.println("Enter a whole number less than |32767|: ")
      int w_Number = sc.nextInt();
    System.out.println("Enter a single letter: ")
      char letter = sc.next().charAt(0);

    //Printing password variations
      System.out.println("Your passphrase is: " + animal + " " + s_Total + " " + w_Number + " " + letter);
      System.out.println("Other variations are: ");
        System.out.println(letter + " " + w_Number + " " + animal + " " + s_Total);
        System.out.println(s_Total + " " + letter + " " + animal + " " + w_Number);
        System.out.println(w_Number + " " + animal + " " + letter + " " + s_Total);
  }
}
