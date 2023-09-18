import java.util.Scanner;

public class Assignment1A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Opening a user input scanner

        System.out.println("Enter a red value (0-255): "); //reading each value and assigning it to a variable
        int red = sc.nextInt();

        System.out.println("Enter a green value (0-255): ");
        int green = sc.nextInt();

        System.out.println("Enter a blue value (0-255): ");
        int blue = sc.nextInt();

        System.out.println("Percentage to brighten color: ");
        float percent = sc.nextFloat();

        sc.close(); //closing the scanner

        float b_Red = ((255 - red) * percent) + red; //Calculating RGB then assigning to brightened values
        float b_Green = ((255 - green) * percent) + green;
        float b_Blue = ((255 - blue) * percent) + blue;

        percent = percent * 100; //Moving the decimal space.

        System.out.println("A " + percent + "% brighter tint of RGB (" + red + ", " + green + ", " + blue + ") is RGB (" + b_Red + ", " + b_Green + ", " + b_Blue + ").");

    }

}


