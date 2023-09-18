import java.util.Scanner;

public class Lab2C {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Starting scanner
      
        System.out.println("Enter a width: ");
        int width = sc.nextInt();  //Taking in user Int input
      
        System.out.println("Enter a height: ");
        int height = sc.nextInt();

        int perimeter = 2 * (height + width); //Setting variable equations
        int area = height * width;

        System.out.println("The area is " + area);

        System.out.println("The perimeter is " + perimeter);

    }

}

