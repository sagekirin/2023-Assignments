import java.util.Scanner;

public class Lab2A {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Initalizing Scanner

        System.out.println("Enter a name: ");
        String Name = sc.nextLine();  //Taking user input and assigning to a variable

        System.out.println("Enter another name: ");
        String s_Name = sc.nextLine();

        System.out.println("Enter a verb: ");
        String verb = sc.nextLine();

        System.out.println("Enter an adverb: ");
        String adverb = sc.nextLine();
			
				//Combining words into a weird little sentence
        System.out.println("Once upon a time, there was a person named " + Name + " who had a child named " + s_Name + ". This child would " + verb + " " + adverb + " while singing to strangers.");

    }

}
