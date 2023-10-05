import java.util.Scanner;

public class Lab5C {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter x: ");
        int x_Val = sc.nextInt();
    System.out.println("Enter y: ");
        int y_Val = sc.nextInt();

    if (x_Val == 0 && y_Val == 0) {
        System.out.println("This point is the origin.");
    }
    else if (x_Val > 0 && y_Val > 0) {
        System.out.println("This point is in the first quadrant.");
    }
    else if (x_Val < 0 && y_Val < 0) {
        System.out.println("This point is in the third quadrant.");
    }
    else if (x_Val > 0 && y_Val < 0) {
        System.out.println("This point is in the fourth quadrant.");
    }
    else if (x_Val < 0 && y_Val > 0) {
        System.out.println("This point is in the second quadrant.");
    }
    else if (x_Val == 0 && y_Val != 0) {
        System.out.println("This point is on the y axis.");
    }
    else if (x_Val != 0 && y_Val == 0) {
        System.out.println("This point is on the x axis.");
    }
  }
}
