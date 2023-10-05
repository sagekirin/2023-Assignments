import java.util.Scanner;

public class Assignment3A {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);  //Starting a new scanner named "sc"

    System.out.println("[WebMD Checker");
    System.out.println("What is your suspected illness?")
        String susIll = sc.nextLine();   //Taking user's input from the line that they enter, assigning it to a string variable

    //Begin if statement
    if (susIll.equals("HGPS")) {
      System.out.println("Do you have brittle bones?")
        String choice = sc.nextLine();  //creating a new string variable from user input
        if (choice.equals("Y")) { //If statement for yes
          System.out.println("It is possible that you have HGPS")
        }
        else { //Else statement for no
          System.out.println("It is not likely that you have HGPS")
        }
    }
      else if (susIll.equals("Lupus")) {  //Second suspected illness choice
        System.out.println("It is not likely that you have Lupus");
        }
    else if (susIll.equals("Bokter Syndrome")) {
        System.out.println("Do you have a Vitamin C deficiency?");
            String choice = sc.nextLine();
                if (choice.equals("Y")) {
                    System.out.println("Are you a sailor?");
                        String choice_2 = sc.nextLine();
                        if (choice_2.equals("Y")) {
                            System.out.println("It is possible that you have Bokter Syndrome");
                        }
                        else {
                            System.out.println("It is not likely you have Bokter Syndrome");
                        }
                }
                else {
                    System.out.println("It is not likely you have Bokter Syndrome");
                }
        }
  }
}
