import java.util.Scanner;

public class Assignment3B {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);  //Starting scanner named sc

        String choice;
        int total = 0;  //Assigning and initalizing values

        System.out.println("[World Traveler Checklist]");

        System.out.println("Have you been to Africa?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++; //adding a count to the total amount of countries if condition is met
        }  //Else statement isn't required

        System.out.println("Have you been to Antarctica?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++;
        }

        System.out.println("Have you been to Asia?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++;
        }

        System.out.println("Have you been to Australia?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++;
        }

        System.out.println("Have you been to Europe?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++;
        }

        System.out.println("Have you been to North America?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++;
        }

        System.out.println("Have you been to South America?");
        choice = sc.nextLine();
        if (choice.equals("Y")) {
            total++;
        }

        switch (total) {  //Using the total number tallied from earlier to comment accordingly
            case 0:
                System.out.println("You have visited " + total + " continents: How is that possible? Are you living in space?");
                break;
            case 1:
                System.out.println("You have visited " + total + " continents: That’s a good start. Time to explore the world!");
                break;
            case 2: //Because the range is 2 - 3, a blank case can be stacked on top of a written one
            case 3:
                System.out.println("You have visited " + total + " continents: You’ve just started your journey to see the world.");
                break;
            case 4:
            case 5:
                System.out.println("You have visited " + total + " continents: You’re an experienced traveler now.");
                break;
            case 6:
                System.out.println("You have visited " + total + " continents: Wow, you’ve been almost everywhere!");
                break;
            case 7:
                System.out.println("You have visited " + total + " continents: You’re a true world traveler!");
                break;
        }
    }
}
