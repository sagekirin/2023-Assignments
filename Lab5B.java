import java.util.Scanner;

public class Lab5B {
  public static void main(String[] args) {
    
    int x = 0;
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter an integer: ");
        int answer = sc.nextInt();
    if (answer % 2 == 0) {       //Run through statements to see if a number is divisible by 2, 3, or 5
        x = 2;   //Setting x to equal 2 if the number is divisible for the switch statement
    }
    else if (answer % 3 == 0) {
        x = 3;
    }
    else if (answer % 5 == 0) {
        x = 5;
    }

  switch (x) {
      case 2:
          System.out.println("This number is divisible by 2");
          break;
      case 3:
          System.out.println("This number is divisible by 3");
          break;
      case 5:
          System.out.println("This number is divisible by 5");
          break;
      default:
          System.out.println("This number is undetermined");
          break;
        }
  }
}
