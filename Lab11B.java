import java.util.Scanner;

public class Lab11B {
    public static Boolean lengthCheck(String password) { //Method checking password length
        if (password.length() >= 8) {
            return true;
        }
        else {
            return false;
        }
    }
    public static Boolean caseCheck(String password) {
        for (int i = 0; i < password.length(); i++) { //For loop iterating through each letter of the user-entered password
            char L = password.charAt(i); //Assign password letter to L char
            if (L > 65 && L < 91) { //Checks whether char value meets ASCII Uppercase values
                return true;
            }
        }
        return false;
    }
    public static Boolean numberCheck(String password) {
        for (int i = 0; i < password.length(); i++) { //Iterating through each letter of the password
            char N = password.charAt(i); //Assigning a char to each letter
            if (N < 65 || N > 91) { //Checks if uppercase
                if (N < 97 || N > 122) { //Checks if lowercase
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        String password;

        System.out.println("Enter a password: ");
            password = sc.nextLine();

        lengthCheck(password);
        if (lengthCheck(password) == true) {
            caseCheck(password);
            if (caseCheck(password) == true) {
                numberCheck(password);
                if (numberCheck(password) == true) {
                    System.out.println("Valid password");
                }
                else {
                    System.out.println("Invalid password");
                }
            }
            else {
                System.out.println("Invalid password");
            }
        }
        else {
            System.out.println("Invalid password");
        }
        System.out.println("Program Ends");
    }
}
