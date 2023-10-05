import java.util.Scanner;

public class Lab5A {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Do you have a driving permit? (Y/N)");
      char permit = sc.next().charAt(0);  //capturing user input and assigning it to a char value
    
    if (permit == 'Y' || permit == 'y') {
        System.out.println("Do you have a commercial driving license (Y/N)?");
            char license = sc.next().charAt(0);

          if (license == 'Y' || license == 'y') {
              System.out.println("Congratulations! You can purchase a vehicle, let’s start talking options!");
          }
          else {
              System.out.println("Commercial driving license is a prerequisite to purchase a vehicle!");
          }
        }

      else {
          System.out.println("Driving permit is a prerequisite to purchase a vehicle!");
      }
  }
}
